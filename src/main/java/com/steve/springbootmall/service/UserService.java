package com.steve.springbootmall.service;

import com.steve.springbootmall.model.User;
import com.steve.springbootmall.model.UserRegisterRequest;

public interface UserService {

	User getUserById(Integer userId);
	
	Integer register(UserRegisterRequest userRegisterRequest); 
	
}
