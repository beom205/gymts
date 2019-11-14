package com.mt.gmts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.mt.gmts.dao.ILoginRepository;
import com.mt.gmts.model.Login;

import lombok.extern.java.Log;


@Service
@Log
public class LoginService implements ILoginService {
	

	@Autowired
	ILoginRepository loginRepository;

	
	@Override
	public boolean loginUser(Login login) {
		String id=null;
		Login resultLogin = new Login();
		resultLogin =loginRepository.loginUser(login.getId());
		
//		log.info("loginUser : " + resultLogin);
		
		//아이디가 없거나 비밀번호가 다르면 false
		if(ObjectUtils.isEmpty(resultLogin)) {
				return false;
		}else {
			//아이디가 있고 비밀번호가 맞으면 true
			if(login.getPassword().equals(resultLogin.getPassword())) {
				return true;
			}else { //아이디가 있지만 비번이 다르면
				return false;
			}
		}
	}
	
}