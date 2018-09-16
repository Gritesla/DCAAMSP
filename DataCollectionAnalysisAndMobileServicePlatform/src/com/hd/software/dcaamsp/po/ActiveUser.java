package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;



/**
 * 用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * 
 * 
 */
public class ActiveUser implements java.io.Serializable {
	private BigDecimal userid;//用户id（主键）
	private BigDecimal roleid;//权限组id
	private String usercode;// 用户账号
	private String username;// 用户名称
	 private String squadronid;//单位编号

	private List<SysPermission> menus;// 菜单
	private List<SysPermission> permissions;// 权限

	public String getSquadronid() {
		return squadronid;
	}

	public void setSquadronid(String squadronid) {
		this.squadronid = squadronid;
	}

	public String getUsername() {
		return username;
	}

	public BigDecimal getRoleid() {
		return roleid;
	}

	public void setRoleid(BigDecimal roleid) {
		this.roleid = roleid;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public BigDecimal getUserid() {
		return userid;
	}

	public void setUserid(BigDecimal bigDecimal) {
		this.userid = bigDecimal;
	}

	public List<SysPermission> getMenus() {
		return menus;
	}

	public void setMenus(List<SysPermission> menus) {
		this.menus = menus;
	}

	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	
}
