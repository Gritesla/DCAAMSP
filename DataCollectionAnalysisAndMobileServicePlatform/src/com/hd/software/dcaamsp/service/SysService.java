package com.hd.software.dcaamsp.service;

import java.math.BigDecimal;
import java.util.List;

import com.hd.software.dcaamsp.po.ActiveUser;
import com.hd.software.dcaamsp.po.SysPermission;
import com.hd.software.dcaamsp.po.SysUser;

/**
 * 
 * <p>Title: SysService</p>
 * <p>Description: 认证授权服务接口</p>
 * @version 1.0
 */
public interface SysService {
	
	//根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode,String password) throws Exception;
	
	//根据用户账号查询用户信息
	public SysUser findSysUserByUserCode(String userCode)throws Exception;
	
	//根据用户id查询权限范围的菜单
	public List<SysPermission> findMenuListByUserId(BigDecimal userid) throws Exception;
	
	//根据用户id查询权限范围的url
	public List<SysPermission> findPermissionListByRoleId(BigDecimal roleid) throws Exception;
}
