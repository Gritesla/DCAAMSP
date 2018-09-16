package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpIndustrialparkCustom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DpIndustrialparkMapperCustom {
	public List<DpIndustrialparkCustom> findParkByPagination(
			@Param("startIndex") String startIndex,
			@Param("endIndex") String endIndex,
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);

	public Integer findParkCountByPagination(
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);
}