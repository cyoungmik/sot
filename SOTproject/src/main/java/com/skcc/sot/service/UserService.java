package com.skcc.sot.service;

import java.util.List;

import com.skcc.sot.vo.UserVO;

public interface UserService {
    
    public List<UserVO> selectUser() throws Exception;
}

