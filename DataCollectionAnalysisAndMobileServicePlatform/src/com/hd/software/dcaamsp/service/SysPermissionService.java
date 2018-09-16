package com.hd.software.dcaamsp.service;

import java.util.List;

import com.hd.software.dcaamsp.po.SysPermission;
import com.hd.software.dcaamsp.po.SysPermissionCustom;

public interface SysPermissionService {

	public List<SysPermissionCustom> findPermissions() throws Exception;
}
