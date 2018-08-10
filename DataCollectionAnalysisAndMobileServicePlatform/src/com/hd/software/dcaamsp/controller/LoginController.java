package com.hd.software.dcaamsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hd.software.dcaamsp.po.User;
import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;
import com.hd.software.dcaamsp.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	// PC登录
	@RequestMapping(value = "/login")
	public String pcLogin(HttpServletRequest req) throws Exception {
		// 如果登录失败从request中获取认证异常信息，就是shiro异常类的全名称
		String shiroLoginFailure = (String) req.getAttribute("shiroLoginFailure");

		if (shiroLoginFailure != null)
			if (UnknownAccountException.class.getName().equals(
					shiroLoginFailure)) {
				System.out.println("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(
					shiroLoginFailure)) {
				System.out.println("用户名或密码错误");
			} else {
				System.out.println("未知错误");
			}
		// 认证成功的部分在Shiro中处理，shiro处理完会回到上一个请求路径
		// 登录失败回到login
		return "login";
	}

	// APP登录
	@RequestMapping(value = "/appLogin")
	public @ResponseBody
	String appLogin(@RequestBody UserQueryVo userQueryVo,
			HttpServletResponse res) throws Exception {
		res.setHeader("Access-Control-Allow-Origin", "*");

		// UserCustom userCustom = userService.findUserByLoginName(userQueryVo);
		ValidateStatus validateStatus = userService.validateLogin(userQueryVo);

		/*
		 * ModelAndView mv = new ModelAndView(); // 指定视图
		 * mv.setViewName("/WEB-INF/jsp/User.jsp");
		 */

		// System.out.println(userCustom.getLoginname());
		System.out.println(validateStatus.toString());
		return validateStatus.toString();
	}

	// 退出

}
