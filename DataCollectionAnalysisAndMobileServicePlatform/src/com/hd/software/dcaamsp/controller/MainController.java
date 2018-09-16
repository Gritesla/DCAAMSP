package com.hd.software.dcaamsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/main")
	public String main() throws Exception {
		// 返回主页面
		return "main";
	}

	@RequestMapping(value = "/statistics")
	public String statistics() {
		return "statistics/statistics_pandect";
	}

	

}
