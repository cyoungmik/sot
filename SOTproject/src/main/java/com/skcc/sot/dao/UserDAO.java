package com.skcc.sot.dao;

import java.util.List;

import com.skcc.sot.vo.UserVO;

public interface UserDAO {
    
    public List<UserVO> selectUser() throws Exception;
}

