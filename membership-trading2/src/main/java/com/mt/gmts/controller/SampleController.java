package com.mt.gmts.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
	
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", sampleService.getEmployee(102) );
		
		return "home";
	}
}
