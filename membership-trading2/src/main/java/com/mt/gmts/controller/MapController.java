package com.mt.gmts.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mt.gmts.model.Gym;
import com.mt.gmts.service.IGymService;

import lombok.extern.java.Log;

@Controller
@Log
public class MapController {

	@Autowired
	IGymService gymService;
	
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String showMap(Locale locale, Model model, HttpServletRequest request) {
		
		HttpSession session =  request.getSession();
		
		String uid = (String) session.getAttribute("uid");
		
		log.info("home uid : " + uid);
		
		return "map2";
	}
	
	@RequestMapping(value = "/map/search", method = RequestMethod.GET)
	public ResponseEntity<List<Gym>> searchGym(@RequestParam String param ,HttpServletRequest request) {
		ResponseEntity<List<Gym>> entity = null;
		
		 HttpSession session = request.getSession();

         String clientID = (String) session.getAttribute("uid");
         
         log.info("map search param : " + param);
		
//         HashMap<String, Object> resultMap = new HashMap<String, Object>();
//         resultMap.put("ddd", "ddd");
//         resultMap.put("dd2", "dd2");
//         resultMap.put("dd3", "dd3");
//         resultMap.put("dd4", "dd4");
//         resultMap.put("dd5", "dd5");
         List<Gym> gymList = null;
         
//         gymList = gymService.searchGym(param);
//         for(Gym g : gymList) {
//             System.out.println(g.getName());
//         }
		try{
			entity = new ResponseEntity<List<Gym>>(gymService.searchGym(param), HttpStatus.OK);
		} catch(Exception e){
			entity = new ResponseEntity<List<Gym>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
