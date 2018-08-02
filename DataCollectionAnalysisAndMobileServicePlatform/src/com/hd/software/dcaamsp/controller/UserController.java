package com.hd.software.dcaamsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hd.software.dcaamsp.po.User;
import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.service.UserService;

/**
 * 
 * 
 * 
 *  */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest req,
	 * HttpServletResponse res) throws Exception { // 检测登录用户名密码 User user = new
	 * User(); user.setLoginName("admin"); user.setPassword("123");
	 * 
	 * 
	 * //填充数据 ModelAndView mv = new ModelAndView(); mv.addObject("user",user);
	 * 
	 * //指定视图 mv.setViewName("/WEB-INF/jsp/login/Login.jsp"); return mv; }
	 */
	@RequestMapping("/findUserByLoginName")
	public ModelAndView findUserByLoginName() throws Exception {

		UserCustom userCustom = userService.findUserByLoginName(null);

		//User user = new User();
		/*
		 * user.setLoginName("admin"); user.setPassword("123");
		 */
		
		
		// 填充数据
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", userCustom);
		System.out.println(userCustom.getLoginname());		
		// 指定视图
		mv.setViewName("/WEB-INF/jsp/User.jsp");
		return mv;
	}
}
