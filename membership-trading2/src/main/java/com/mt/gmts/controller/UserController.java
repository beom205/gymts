package com.mt.gmts.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String resister(Locale locale, Model model) {
		/*
		 * Date date = new Date(); DateFormat dateFormat =
		 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		 * 
		 * String formattedDate = dateFormat.format(date);
		 * 
		 * model.addAttribute("serverTime", formattedDate );
		 */
		
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String registerUser(User user, Model model,HttpServletRequest request) {
			
		log.info(""+user);
		try {
			userService.registerUser(user);
			
			HttpSession session =  request.getSession();
			session.setAttribute("uid", user.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	
}
