package com.skcc.sot.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.skcc.sot.controller.HomeController;
import com.skcc.sot.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
 
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @Inject
    private SqlSession sqlSession;
    
    @Override
    public List<UserVO> selectUser() throws Exception {
 
		logger.info("#####UserDAOImpl.selectUser#####");
		List<UserVO> userList = sqlSession.selectList("UserSql.selectUser");
		logger.info("#####UserDAOImpl.selectUser##### userList: "+userList);
        return sqlSession.selectList("UserSql.selectUser");
        
    }
 
}

