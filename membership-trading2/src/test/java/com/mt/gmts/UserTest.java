package com.mt.gmts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt.gmts.dao.IUserRepository;
import com.mt.gmts.model.User;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class UserTest {

	@Autowired
	IUserRepository userRepo;
	
	@Test
	public void testConnection() {
		User user = new User();
		
		user.setId("1");
		user.setEmail("sdfasf@asf.asdf");
		user.setPassword("asdads");
		user.setPhone("01099996645");
		
		userRepo.registerUser(user);
	}
}
