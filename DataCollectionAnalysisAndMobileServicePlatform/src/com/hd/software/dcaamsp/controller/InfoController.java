package com.hd.software.dcaamsp.controller;

import java.util.List;
import java.util.Map;

import javax.json.JsonArray;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.software.dcaamsp.po.ActiveUser;
import com.hd.software.dcaamsp.po.DpDetachmentCustom;
import com.hd.software.dcaamsp.po.DpImportantCustom;
import com.hd.software.dcaamsp.po.DpIndustrialparkCustom;
import com.hd.software.dcaamsp.po.DpSmallplaces;
import com.hd.software.dcaamsp.po.SysUserCustom;
import com.hd.software.dcaamsp.service.InfoService;
import com.hd.software.dcaamsp.service.SysUserService;

@Controller
public class InfoController {

	@Autowired
	private InfoService infoService;

	@RequestMapping(value = "/info/important")
	public String important() {
		return "info/info_important";
	}

	@RequestMapping(value = "/info/detachment")
	public String detachment() {
		return "info/info_detachment";
	}

	@RequestMapping(value = "/info/park")
	public String park() {
		return "info/info_park";
	}

	@RequestMapping(value = "/info/small")
	public String small() {
		return "info/info_small";
	}

	@RequestMapping(value = "/info/getimportant", produces = "application/json")
	@ResponseBody
	public String getImportant(@RequestBody Map<String, Object> params)
			throws Exception {
		ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
				.getPrincipal();
		int total = infoService.findImportantCountByPagination(
				params.get("unitName").toString(), activeUser.getSquadronid());
		int pageSize = Integer.parseInt(params.get("pageSize").toString());
		int pageIndex = Integer.parseInt(params.get("pageIndex").toString());
		List<DpImportantCustom> importantList = infoService
				.findImportantByPagination((pageSize * (pageIndex - 1) + 1)
						+ "", pageSize * pageIndex + "", params.get("unitName")
						.toString(), activeUser.getSquadronid());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(importantList);
		json = "{\"total\":" + total + ",\"data\":" + json + ",\"errcode\":0}";
		System.out.println(json);
		return json;
	}

	@RequestMapping(value = "/info/getdetachment", produces = "application/json")
	@ResponseBody
	public String getDetachment(@RequestBody Map<String, Object> params)
			throws Exception {
		ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
				.getPrincipal();
		int total = infoService.findDetachmentCountByPagination(
				params.get("unitName").toString(), activeUser.getSquadronid());
		int pageSize = Integer.parseInt(params.get("pageSize").toString());
		int pageIndex = Integer.parseInt(params.get("pageIndex").toString());
		List<DpDetachmentCustom> detachmentList = infoService
				.findDetachmentByPagination((pageSize * (pageIndex - 1) + 1)
						+ "", pageSize * pageIndex + "", params.get("unitName")
						.toString(), activeUser.getSquadronid());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(detachmentList);
		json = "{\"total\":" + total + ",\"data\":" + json + ",\"errcode\":0}";
		System.out.println(json);
		return json;
	}

	@RequestMapping(value = "/info/getpark", produces = "application/json")
	@ResponseBody
	public String getPark(@RequestBody Map<String, Object> params)
			throws Exception {
		ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
				.getPrincipal();
		int total = infoService.findParkCountByPagination(params
				.get("unitName").toString(), activeUser.getSquadronid());
		int pageSize = Integer.parseInt(params.get("pageSize").toString());
		int pageIndex = Integer.parseInt(params.get("pageIndex").toString());
		List<DpIndustrialparkCustom> parkList = infoService
				.findParkByPagination((pageSize * (pageIndex - 1) + 1) + "",
						pageSize * pageIndex + "", params.get("unitName")
								.toString(), activeUser.getSquadronid());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(parkList);
		json = "{\"total\":" + total + ",\"data\":" + json + ",\"errcode\":0}";
		System.out.println(json);
		return json;
	}

	@RequestMapping(value = "/info/getsmall", produces = "application/json")
	@ResponseBody
	public String getsmall(@RequestBody Map<String, Object> params)
			throws Exception {
		/*
		 * ActiveUser activeUser = (ActiveUser) SecurityUtils.getSubject()
		 * .getPrincipal();
		 */
		int total = infoService.findSmallCountByPagination(params.get(
				"unitName").toString());
		System.out.println(total);
		int pageSize = Integer.parseInt(params.get("pageSize").toString());
		int pageIndex = Integer.parseInt(params.get("pageIndex").toString());
		List<DpSmallplaces> smallList = infoService
				.fineSmallplacesByPagination((pageSize * (pageIndex - 1) + 1)
						+ "", pageSize * pageIndex + "", params.get("unitName")
						.toString());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(smallList);
		json = "{\"total\":" + total + ",\"data\":" + json + ",\"errcode\":0}";
		System.out.println(json);
		return json;
	}
}
