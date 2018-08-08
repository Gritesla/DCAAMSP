package com.hd.software.dcaamsp.service;

import com.hd.software.dcaamsp.po.UserCustom;
import com.hd.software.dcaamsp.po.UserQueryVo;
import com.hd.software.dcaamsp.po.ValidateStatus;

public interface UserService {
	public UserCustom findUserByLoginName(UserQueryVo userQueryVo) throws Exception;
	
	public ValidateStatus validateLogin(UserQueryVo userQueryVo) throws Exception;
}
