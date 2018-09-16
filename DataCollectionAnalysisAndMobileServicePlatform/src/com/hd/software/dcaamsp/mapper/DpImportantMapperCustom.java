package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpImportantCustom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DpImportantMapperCustom {
	public List<DpImportantCustom> findImportantByPagination(
			@Param("startIndex") String startIndex,
			@Param("endIndex") String endIndex,
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);

	public Integer findImportantCountByPagination(@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);
}