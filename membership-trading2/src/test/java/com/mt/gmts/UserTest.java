package com.mt.gmts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt.gmts.dao.ILoginRepository;
import com.mt.gmts.dao.IUserRepository;
import com.mt.gmts.mapper.LoginMapper;
import com.mt.gmts.model.Login;
import com.mt.gmts.model.User;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class UserTest {

	@Autowired
	IUserRepository userRepo;
	
	@Autowired
	ILoginRepository loginRepo;
	
	@Autowired
	LoginMapper loginMap;
	
	@Test
	public void testConnection() {
		User user = new User();
		
		user.setId("1");
		user.setEmail("sdfasf@asf.asdf");
		user.setPassword("asdads");
		user.setPhone("01099996645");
		
		userRepo.registerUser(user);
	}
	
	@Test
	public void testLogin() {
		
		Login login = new Login();
		login.setId("1");
		login.setPassword("asdfasdf");
		
		
//		loginRepo.loginUser(login);
//		String result = loginMap.loginUser(login);
		String result = loginRepo.loginUser(login);
		log.info("testLogin : " + result);
	}
	@Test
	public void testcount() {
		
		String uno_temp="select count(*) from customer";

		log.info(uno_temp);
	}
}
