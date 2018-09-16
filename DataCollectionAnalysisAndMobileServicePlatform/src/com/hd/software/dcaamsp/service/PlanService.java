package com.hd.software.dcaamsp.service;

import java.util.List;

import com.hd.software.dcaamsp.po.DpBasicplan;

public interface PlanService {

	public Integer findBasicCountByPagination(String unitName,String unitCode);

	public List<DpBasicplan> fineBasicByPagination(String startIndex,
			String endIndex, String unitName,String unitCode);

}
