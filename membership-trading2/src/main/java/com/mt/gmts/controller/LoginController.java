package com.mt.gmts.controller;


import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mt.gmts.model.Login;
import com.mt.gmts.service.ILoginService;

import lombok.extern.java.Log;

@Controller
@Log
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
		
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {

		return "signin";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
//		String clientID = (String)session.getAttribute("cID");
		session.invalidate();
//		if(clientID != null){
//			return true;
//		}
		return "index"; 
	}
	
	@RequestMapping(value="/signin", method=RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public ResponseEntity<HashMap<String,Object>> loginUser(@RequestBody Login login, Model model, HttpServletRequest request) {
		
		log.info("/signin : " + login);
		
		HttpSession session =  request.getSession();
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		boolean result= false;
		
		result = loginService.loginUser(login);
		
		if(result) {
			 session.setAttribute("uid", login.getId());
			 log.info("로그인완료");
			 resultMap.put("result", true);
			return new ResponseEntity<HashMap<String,Object>>(resultMap, HttpStatus.OK);
		}else {
			resultMap.put("result", false);
			return new ResponseEntity<HashMap<String,Object>>(resultMap, HttpStatus.OK);
		}
		
//		  if(result==1) {model.addAttribute("serverLogin","비밀번호가 틀렸습니다."); return
//		  "redirect:/login"; } else if(result==2) {
//		  model.addAttribute("serverLogin","해당 아이디가 존재하지 않습니다."); return
//		  "redirect:/login"; } else if(result==3) {
//		  model.addAttribute("serverLogin","로그인성공."); return "redirect:/login"; }
		 
//		return "redirect:/login";
	}
}