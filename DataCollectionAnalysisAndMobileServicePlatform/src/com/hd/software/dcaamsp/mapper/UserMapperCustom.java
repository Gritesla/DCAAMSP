package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.User;
import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;

public interface UserMapperCustom {

	public UserCustom findUserByLoginName(UserQueryVo userQueryVo)
			throws Exception;

	public Integer validateLogin(UserQueryVo userQueryVo) throws Exception;
}