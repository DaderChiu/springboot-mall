package com.steve.springbootmall.dao;

import com.steve.springbootmall.model.User;
import com.steve.springbootmall.model.UserRegisterRequest;

public interface UserDao {

	User getUserById(Integer userId);
	
	Integer createUser(UserRegisterRequest userRegisterRequest);
	
}
