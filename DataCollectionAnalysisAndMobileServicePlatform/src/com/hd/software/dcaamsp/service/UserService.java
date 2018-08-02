package com.hd.software.dcaamsp.service;

import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;

public interface UserService {
	public UserCustom findUserByLoginName(UserQueryVo userQueryVo) throws Exception;
}
