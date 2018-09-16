package com.hd.software.dcaamsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.software.dcaamsp.po.SysPermissionCustom;
import com.hd.software.dcaamsp.po.SysRoleCustom;
import com.hd.software.dcaamsp.service.SysPermissionService;
import com.hd.software.dcaamsp.service.SysRoleService;

@Controller
public class AuthorityController {
	@Autowired
	private SysRoleService roleService;

	@Autowired
	private SysPermissionService permissionService;

	@RequestMapping(value = "/auth/group")
	public String authorityGroup() {
		return "auth/auth_group";
	}

	@RequestMapping(value = "/auth/setting")
	public String authoritySetting() {
		return "auth/auth_setting";
	}

	@RequestMapping(value = "/auth/getgroup")
	@ResponseBody
	public String getGroups() throws Exception {
		List<SysRoleCustom> roleList = roleService.findRoleGroup();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(roleList);
		System.out.println(json);
		return json;
	}

	@RequestMapping(value = "/auth/getpermission")
	@ResponseBody
	public String getPermissions() throws Exception {
		List<SysPermissionCustom> permissionList = permissionService
				.findPermissions();

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(permissionList);
		System.out.println(json);
		return json;
	}

	@RequestMapping(value = "/auth/testdata")
	@ResponseBody
	public String testdata() throws Exception {
		String json = "[{ \"Id\":1,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" },";
		json += "{ \"Id\":2,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" },";
		json += "{ \"Id\":3,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" },";
		json += "{ \"Id\":11,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" ,\"ParentId\":2},";
		json += "{ \"Id\":12,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" ,\"ParentId\":2},";
		json += "{ \"Id\":10,\"Name\":\"百度科技\",\"Desc\":\"百搜索巨头科技\" ,\"ParentId\":2}]";
		return json;
	}
}
