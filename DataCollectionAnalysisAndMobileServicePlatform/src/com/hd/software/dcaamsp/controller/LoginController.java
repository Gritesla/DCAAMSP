package com.hd.software.dcaamsp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hd.software.dcaamsp.po.SysUserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;
import com.hd.software.dcaamsp.service.SysUserService;

@Controller
public class LoginController {

/*	@Autowired
	private SysService sysService;*/
	
	@Autowired
	private SysUserService userService;

	// PC登录
	@RequestMapping(value = "login")
	public String pcLogin(HttpServletRequest req) throws Exception {
		// 如果登录失败从request中获取认证异常信息，就是shiro异常类的全名称
		String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");

		if (exceptionClassName != null) {
			if (UnknownAccountException.class.getName().equals(
					exceptionClassName)) {
				// 最终会抛给异常处理器
				System.out.println("账号不存在");
				// throw new CustomException("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				System.out.println("用户名/密码错误");
				// throw new CustomException("用户名/密码错误");
			} else if ("randomCodeError".equals(exceptionClassName)) {
				// throw new CustomException("验证码错误 ");
				System.out.println("验证码错误 ");
			} else {
				throw new Exception();// 最终在异常处理器生成未知错误
			}
		}
		// 认证成功的部分在Shiro中处理，shiro处理完会回到上一个请求路径
		// 登录失败回到login
		return "login";
	}

	// APP登录
	@RequestMapping(value = "/appLogin")
	public @ResponseBody
	String appLogin(@RequestBody SysUserQueryVo userQueryVo,
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
