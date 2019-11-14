package com.mt.gmts.controller;

import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		
		return "map2";
	}
	
	@RequestMapping(value = "/map/search", method = RequestMethod.GET)
	public ResponseEntity<HashMap<String,Object>> searchGym(HttpServletRequest request) {
		ResponseEntity<HashMap<String,Object>> entity = null;
		
		 HttpSession session = request.getSession();

         String clientID = (String) session.getAttribute("uid");
		
         HashMap<String, Object> resultMap = new HashMap<String, Object>();
         resultMap.put("ddd", "ddd");
         resultMap.put("dd2", "dd2");
         resultMap.put("dd3", "dd3");
         resultMap.put("dd4", "dd4");
         resultMap.put("dd5", "dd5");
		try{
			entity = new ResponseEntity<HashMap<String,Object>>(resultMap, HttpStatus.OK);
		} catch(Exception e){
			entity = new ResponseEntity<HashMap<String,Object>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
