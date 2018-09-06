package com.skcc.sot.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.skcc.sot.controller.HomeController;
import com.skcc.sot.dao.UserDAO;
import com.skcc.sot.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @Autowired
    private UserDAO userDao;
    
    @Override
    public List<UserVO> selectUser() throws Exception {
		logger.info("#####UserServiceImpl#####");
        return userDao.selectUser();
    }
 
}

