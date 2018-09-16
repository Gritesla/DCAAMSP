package com.hd.software.dcaamsp.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.po.ActiveUser;
import com.hd.software.dcaamsp.po.SysPermission;
import com.hd.software.dcaamsp.po.SysUser;
import com.hd.software.dcaamsp.service.SysService;

public class CustomRealm extends AuthorizingRealm {

	@Autowired
	private SysService sysService;

	// 认证方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		String userCode = (String) token.getPrincipal();

		SysUser sysUser = null;
		try {
			sysUser = sysService.findSysUserByUserCode(userCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (sysUser == null)
			return null;

		String password = sysUser.getDpRespPassword();
		String salt = sysUser.getDpRespSalt();

		ActiveUser activeUser = new ActiveUser();
		activeUser.setUserid(sysUser.getDpRespId());
		activeUser.setUsercode(sysUser.getDpRespUsercode());
		activeUser.setUsername(sysUser.getDpRespUsername());
		activeUser.setSquadronid(sysUser.getDpRespSquadronid());
		activeUser.setRoleid(sysUser.getDpRespRoleid());

		List<SysPermission> menus = null;

		try {
			menus = sysService.findMenuListByUserId(sysUser.getDpRespId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		activeUser.setMenus(menus);

		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
				activeUser, password, ByteSource.Util.bytes(salt),
				this.getName());
		return simpleAuthenticationInfo;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("customRealm");
	}

	// 授权方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// 从 principals获取主身份信息
		// 将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
		ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();

		// 根据身份信息获取权限信息
		// 从数据库获取到权限数据
		List<SysPermission> permissionList = null;
		try {
			permissionList = sysService.findPermissionListByRoleId(activeUser
					.getRoleid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 单独定一个集合对象
		List<String> permissions = new ArrayList<String>();
		if (permissionList != null) {
			for (SysPermission sysPermission : permissionList) {
				// 将数据库中的权限标签 符放入集合
				permissions.add(sysPermission.getDpRespCode().toString());
			}
		}
		// 查到权限数据，返回授权信息(要包括 上边的permissions)
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		// 将上边查询到授权信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);

		return simpleAuthorizationInfo;
	}

	// 清除缓存
	public void clearCached() {
		PrincipalCollection principals = SecurityUtils.getSubject()
				.getPrincipals();
		super.clearCache(principals);
	}

}
