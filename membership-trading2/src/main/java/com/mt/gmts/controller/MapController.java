package com.mt.gmts.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;

@Controller
@Log
public class MapController {

	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String showMap(Locale locale, Model model, HttpServletRequest request) {
		
		HttpSession session =  request.getSession();
		
		String uid = (String) session.getAttribute("uid");
		
		log.info("home uid : " + uid);
		
		return "map";
	}
}
