package com.mt.gmts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.gmts.dao.ILoginRepository;
import com.mt.gmts.model.Login;


@Service
public class LoginService implements ILoginService {
	

	@Autowired
	ILoginRepository loginRepository;

	
	@Override
	public boolean loginUser(Login login) {
		String id=null;
		id=loginRepository.loginUser(login);
		
		if(!(login.getId().equals(id))) return false;
		
		return true;
		
//		if(!(login.getPassword()==password)) return 1;
//		if(password=="")return 2;
//		else return 3;
	}
	
}