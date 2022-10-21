package com.steve.springbootmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.steve.springbootmall.dao.UserDao;
import com.steve.springbootmall.model.User;
import com.steve.springbootmall.model.UserRegisterRequest;
import com.steve.springbootmall.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserById(Integer userId) {
		
		return userDao.getUserById(userId);
		
	}
	
	@Override
	public Integer register(UserRegisterRequest userRegisterRequest) {
		
		return userDao.createUser(userRegisterRequest);
		
	}

}
