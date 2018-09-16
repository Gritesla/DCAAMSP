package com.hd.software.dcaamsp.service;

import java.util.List;

import com.hd.software.dcaamsp.po.SysUserCustom;
import com.hd.software.dcaamsp.po.SysUserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;

public interface SysUserService {
	public SysUserCustom findUserByLoginName(SysUserQueryVo userQueryVo) throws Exception;
	
	public ValidateStatus validateLogin(SysUserQueryVo userQueryVo) throws Exception;
	
	public  List<SysUserCustom> findUsersBySquadronid(String squadronId)throws Exception;
}
