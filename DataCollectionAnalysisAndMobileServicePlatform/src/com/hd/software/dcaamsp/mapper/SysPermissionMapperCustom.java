package com.hd.software.dcaamsp.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.hd.software.dcaamsp.po.SysPermission;
import com.hd.software.dcaamsp.po.SysPermissionCustom;


/**
 * 
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 * @version 1.0
 */
public interface SysPermissionMapperCustom {
	
	//根据用户id查询菜单
	public List<SysPermission> findMenuListByUserId(BigDecimal userid)throws Exception;
	//根据用户id查询权限url
	public List<SysPermission> findPermissionListByRoleId(BigDecimal roleid)throws Exception;
	
	public List<SysPermissionCustom> findPermissions() throws Exception;

}
