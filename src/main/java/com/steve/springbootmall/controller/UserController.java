package com.steve.springbootmall.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.steve.springbootmall.model.User;
import com.steve.springbootmall.model.UserRegisterRequest;
import com.steve.springbootmall.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("users/register")
	public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest){
		
		Integer uesrId = userService.register(userRegisterRequest);
		
		User user = userService.getUserById(uesrId);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
		
	}
	
	
}
