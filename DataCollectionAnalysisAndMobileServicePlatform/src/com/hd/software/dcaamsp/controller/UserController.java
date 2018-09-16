package com.hd.software.dcaamsp.controller;

import java.util.List;

import javax.json.JsonArray;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.software.dcaamsp.po.ActiveUser;
import com.hd.software.dcaamsp.po.SysUserCustom;
import com.hd.software.dcaamsp.service.SysUserService;

@Controller
public class UserController {
	@Autowired
	private SysUserService userService;
	
	@RequestMapping(value = "/user/manage")
	public String userManage() {
		return "user/user_manage";
	}

	@RequestMapping(value = "/user/get", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	String getUsers(@RequestBody String str, HttpServletResponse res)
			throws Exception {
		res.setHeader("Access-Control-Allow-Origin", "*");
		ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
				.getPrincipal();
		List<SysUserCustom> userList = userService
				.findUsersBySquadronid(activeUser.getSquadronid());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(userList);
		System.out.println(json);
		return mapper.writeValueAsString(userList);
	}
}
