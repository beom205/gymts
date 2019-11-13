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

import com.mt.gmts.service.SampleService;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {


	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		HttpSession session =  request.getSession();
		
		String uid = (String) session.getAttribute("uid");
		
		log.info("home uid : " + uid);
		
		return "index";
	}
}
