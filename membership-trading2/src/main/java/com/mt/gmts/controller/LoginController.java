package com.mt.gmts.controller;


import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mt.gmts.service.ILoginService;
import com.mt.gmts.model.Login;

import lombok.extern.java.Log;

@Controller
@Log
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
		
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginUser(Login login, Model model) {
		
		int result=loginService.loginUser(login);
		
		  if(result==1) {model.addAttribute("serverLogin","비밀번호가 틀렸습니다."); return
		  "redirect:/login"; } else if(result==2) {
		  model.addAttribute("serverLogin","해당 아이디가 존재하지 않습니다."); return
		  "redirect:/login"; } else if(result==3) {
		  model.addAttribute("serverLogin","로그인성공."); return "redirect:/login"; }
		 
		return "redirect:/login";}}