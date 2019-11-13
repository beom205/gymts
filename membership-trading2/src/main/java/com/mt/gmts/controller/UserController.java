
package com.mt.gmts.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mt.gmts.service.IUserService;
import com.mt.gmts.model.User;

import lombok.extern.java.Log;

@Controller
@Log
public class UserController {
	
	@Autowired
	private IUserService userService;
		
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerUser(User user, Model model) {
		
		log.info(""+user);
		userService.registerUser(user);
		return "redirect:/login";
	}
}
