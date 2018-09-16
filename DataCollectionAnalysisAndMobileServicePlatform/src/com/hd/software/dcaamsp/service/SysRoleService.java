package com.hd.software.dcaamsp.service;

import java.util.List;

import com.hd.software.dcaamsp.po.SysRoleCustom;


public interface SysRoleService {

	public List<SysRoleCustom> findRoleGroup() throws Exception;
}
