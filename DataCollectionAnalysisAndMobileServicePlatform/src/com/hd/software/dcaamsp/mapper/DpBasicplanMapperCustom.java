package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpSmallplaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DpBasicplanMapperCustom {

	public Integer findSmallCountByPagination(
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);

	public List<DpSmallplaces> fineSmallplacesByPagination(
			@Param("startIndex") String startIndex,
			@Param("endIndex") String endIndex,
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);
}