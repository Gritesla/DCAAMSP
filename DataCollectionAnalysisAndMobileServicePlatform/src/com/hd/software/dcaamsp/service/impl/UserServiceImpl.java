package com.hd.software.dcaamsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.constant.ResultStatus;
import com.hd.software.dcaamsp.mapper.UserMapperCustom;
import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;
import com.hd.software.dcaamsp.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapperCustom userMapperCustom;

	@Override
	public UserCustom findUserByLoginName(UserQueryVo userQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return userMapperCustom.findUserByLoginName(userQueryVo);
	}

	@Override
	public ValidateStatus validateLogin(UserQueryVo userQueryVo)
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

}
