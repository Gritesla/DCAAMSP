package com.hd.software.dcaamsp.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hd.software.dcaamsp.po.DpDetachmentCustom;
import com.hd.software.dcaamsp.po.DpImportantCustom;
import com.hd.software.dcaamsp.po.DpIndustrialpark;
import com.hd.software.dcaamsp.po.DpIndustrialparkCustom;
import com.hd.software.dcaamsp.po.DpSmallplaces;

public interface InfoService {
	public List<DpImportantCustom> findImportantByPagination(String startIndex,
			String endIndex, String unitName, String unitCode);

	public Integer findImportantCountByPagination(String unitName, String unitCode);
	
	public List<DpDetachmentCustom> findDetachmentByPagination(String startIndex,
			String endIndex, String unitName, String unitCode);

	public Integer findDetachmentCountByPagination(String unitName, String unitCode);
	
	public List<DpIndustrialparkCustom> findParkByPagination(String startIndex,
			String endIndex, String unitName, String unitCode);

	public Integer findParkCountByPagination(String unitName, String unitCode);
	
	public Integer findSmallCountByPagination(String unitName);
	
	public List<DpSmallplaces> fineSmallplacesByPagination(String startIndex,String endIndex,String unitName);
	
}
