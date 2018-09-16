package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpDetachmentCustom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DpDetachmentMapperCustom {
	public List<DpDetachmentCustom> findDetachmentByPagination(
			@Param("startIndex") String startIndex,
			@Param("endIndex") String endIndex,
			@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);

	public Integer findDetachmentCountByPagination(@Param("unitName") String unitName,
			@Param("unitCode") String unitCode);
}