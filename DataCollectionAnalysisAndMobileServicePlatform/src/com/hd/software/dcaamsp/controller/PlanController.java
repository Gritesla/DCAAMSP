package com.hd.software.dcaamsp.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.software.dcaamsp.po.ActiveUser;
import com.hd.software.dcaamsp.po.DpBasicplan;
import com.hd.software.dcaamsp.po.DpSmallplaces;
import com.hd.software.dcaamsp.service.PlanService;

@Controller
public class PlanController {

	@Autowired
	private PlanService planService;

	@RequestMapping(value = "/plan/pandect")
	public String planPandect() {
		return "plan/plan_pandect";
	}

	@RequestMapping(value = "/plan/basic")
	public String planBasic() {
		return "plan/plan_basic";
	}

	@RequestMapping(value = "/plan/2d/pandect")
	public String twoDimensionalPlan() {
		return "plan/plan_two_pandect";
	}

	@RequestMapping(value = "/plan/3d")
	public String threeDimensionalPlan() {
		return "plan/plan_three_pandect";
	}

	@RequestMapping(value = "/plan/getbasic")
	@ResponseBody
	public String getBasic(@RequestBody Map<String, Object> params)
			throws Exception {

		ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
				.getPrincipal();

		int total = planService.findBasicCountByPagination(params.get(
				"unitName").toString(),
				activeUser.getSquadronid());
		
		int pageSize = Integer.parseInt(params.get("pageSize").toString());
		int pageIndex = Integer.parseInt(params.get("pageIndex").toString());
		List<DpBasicplan> basicList = planService.fineBasicByPagination(
				(pageSize * (pageIndex - 1) + 1) + "", pageSize * pageIndex
						+ "", params.get(
								"unitName").toString(), activeUser.getSquadronid());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(basicList);
		json = "{\"total\":" + total + ",\"data\":" + json + ",\"errcode\":0}";
		System.out.println(json);
		return json;
	}

}
