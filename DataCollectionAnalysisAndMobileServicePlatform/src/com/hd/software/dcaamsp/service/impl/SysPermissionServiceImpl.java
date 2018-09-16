package com.hd.software.dcaamsp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.mapper.SysPermissionMapperCustom;
import com.hd.software.dcaamsp.po.SysPermission;
import com.hd.software.dcaamsp.po.SysPermissionCustom;
import com.hd.software.dcaamsp.service.SysPermissionService;


public class SysPermissionServiceImpl implements SysPermissionService {

	@Autowired
	private SysPermissionMapperCustom permissionMapperCuston;
	
	@Override
	public List<SysPermissionCustom> findPermissions() throws Exception {
		// TODO Auto-generated method stub
		return permissionMapperCuston.findPermissions();
	}

}
