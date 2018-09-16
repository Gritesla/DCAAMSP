package com.hd.software.dcaamsp.mapper;

import java.util.List;

import com.hd.software.dcaamsp.po.SysUserCustom;
import com.hd.software.dcaamsp.po.SysUserQueryVo;

public interface SysUserMapperCustom {

	public SysUserCustom findUserByLoginName(SysUserQueryVo sysUserQueryVo)
			throws Exception;

	public Integer validateLogin(SysUserQueryVo sysUserQueryVo) throws Exception;
	
	public List<SysUserCustom> findUsersBySquadronid(String squadronId)throws Exception;
}