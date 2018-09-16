package com.hd.software.dcaamsp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.mapper.SysRoleMapperCustom;
import com.hd.software.dcaamsp.po.SysRoleCustom;
import com.hd.software.dcaamsp.service.SysRoleService;

public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleMapperCustom roleMapperCustom;

	@Override
	public List<SysRoleCustom> findRoleGroup() throws Exception {
		// TODO Auto-generated method stub
		return roleMapperCustom.findRoleGroup();
	}



}
