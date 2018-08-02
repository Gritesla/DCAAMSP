package com.hd.software.dcaamsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.software.dcaamsp.mapper.UserMapperCustom;
import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;
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

}
