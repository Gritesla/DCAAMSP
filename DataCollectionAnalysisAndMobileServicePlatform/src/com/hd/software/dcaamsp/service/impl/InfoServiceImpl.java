package com.hd.software.dcaamsp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.mapper.DpDetachmentMapperCustom;
import com.hd.software.dcaamsp.mapper.DpImportantMapperCustom;
import com.hd.software.dcaamsp.mapper.DpIndustrialparkMapperCustom;
import com.hd.software.dcaamsp.mapper.DpSmallplacesMapper;
import com.hd.software.dcaamsp.mapper.DpSmallplacesMapperCustom;
import com.hd.software.dcaamsp.po.DpDetachmentCustom;
import com.hd.software.dcaamsp.po.DpImportantCustom;
import com.hd.software.dcaamsp.po.DpIndustrialparkCustom;
import com.hd.software.dcaamsp.po.DpSmallplaces;
import com.hd.software.dcaamsp.po.DpSmallplacesExample;
import com.hd.software.dcaamsp.service.InfoService;

public class InfoServiceImpl implements InfoService {

	@Autowired
	private DpSmallplacesMapperCustom dpSmallplacesMapperCustom;

	@Autowired
	private DpImportantMapperCustom dpImportantMapperCustom;

	@Autowired
	private DpDetachmentMapperCustom dpDetachmentMapperCustom;

	@Autowired
	private DpIndustrialparkMapperCustom dpIndustrialparkMapperCustom;

	@Override
	public List<DpImportantCustom> findImportantByPagination(String startIndex,
			String endIndex, String unitName, String unitCode) {
		return dpImportantMapperCustom.findImportantByPagination(startIndex,
				endIndex, unitName, unitCode);
	}

	@Override
	public Integer findImportantCountByPagination(String unitName,
			String unitCode) {
		return dpImportantMapperCustom.findImportantCountByPagination(unitName,
				unitCode);
	}

	@Override
	public List<DpDetachmentCustom> findDetachmentByPagination(
			String startIndex, String endIndex, String unitName, String unitCode) {
		return dpDetachmentMapperCustom.findDetachmentByPagination(startIndex,
				endIndex, unitName, unitCode);
	}

	@Override
	public Integer findDetachmentCountByPagination(String unitName,
			String unitCode) {
		return dpDetachmentMapperCustom.findDetachmentCountByPagination(
				unitName, unitCode);
	}

	@Override
	public List<DpIndustrialparkCustom> findParkByPagination(String startIndex,
			String endIndex, String unitName, String unitCode) {
		return dpIndustrialparkMapperCustom.findParkByPagination(startIndex,
				endIndex, unitName, unitCode);
	}

	@Override
	public Integer findParkCountByPagination(String unitName, String unitCode) {
		return dpIndustrialparkMapperCustom.findParkCountByPagination(unitName,
				unitCode);
	}

	@Override
	public Integer findSmallCountByPagination(String unitName) {		
		return dpSmallplacesMapperCustom.findSmallCountByPagination(unitName);
	}

	@Override
	public List<DpSmallplaces> fineSmallplacesByPagination(String startIndex,
			String endIndex, String unitName) {
		return dpSmallplacesMapperCustom.fineSmallplacesByPagination(
				startIndex, endIndex, unitName);
	}

}
