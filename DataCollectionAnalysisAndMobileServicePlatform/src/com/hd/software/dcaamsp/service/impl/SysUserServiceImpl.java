package com.hd.software.dcaamsp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.constant.ResultStatus;
import com.hd.software.dcaamsp.mapper.SysUserMapperCustom;
import com.hd.software.dcaamsp.po.SysUserCustom;
import com.hd.software.dcaamsp.po.SysUserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;
import com.hd.software.dcaamsp.service.SysUserService;

public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapperCustom userMapperCustom;

	@Override
	public SysUserCustom findUserByLoginName(SysUserQueryVo userQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return userMapperCustom.findUserByLoginName(userQueryVo);
	}

	@Override
	public ValidateStatus validateLogin(SysUserQueryVo userQueryVo)
			throws Exception {

		ValidateStatus validateStatus = new ValidateStatus();
		Integer resultCount = userMapperCustom.validateLogin(userQueryVo);
		if (resultCount == 1) {
			validateStatus.setStatus(ResultStatus.RES_SUCCESS);
			validateStatus.setMessage("登录成功");
		} else {
			validateStatus.setStatus(ResultStatus.RES_ERROR);
			validateStatus.setMessage("用户名或密码错误");
		}
		return validateStatus;
	}

	@Override
	public List<SysUserCustom> findUsersBySquadronid(String squadronId)
			throws Exception {

		return userMapperCustom.findUsersBySquadronid(squadronId);
	}

}
