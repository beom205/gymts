package com.mt.gmts.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.gmts.dao.IUserRepository;
import com.mt.gmts.model.User;


@Service
public class UserService implements IUserService {
	

	@Autowired
	IUserRepository userRepository;

	
	@Override
	public void registerUser(User user) {
		userRepository.registerUser(user);
	}
}