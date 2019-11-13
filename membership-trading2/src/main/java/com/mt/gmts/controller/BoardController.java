package com.mt.gmts.controller;

import java.awt.List;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mt.gmts.model.board_dto;
import com.mt.gmts.service.BoardService;

import lombok.extern.java.Log;

@Controller
@Log
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) throws Exception{
		model.addAttribute("title", boardService.getGno("A"));
		model.addAttribute("context", boardService.getUno("A"));
		model.addAttribute("test",  boardService.getAll(1));
		log.info(""+boardService.getAll(1));
		return "home";
		
	}
	
	@RequestMapping(value = "/board", method = RequestMethod.POST)
	public String boardpost(board_dto dto, Model model) throws Exception {
		System.out.println(dto.toString());
		boardService.setboard(dto);
		return "home";
	}
	
	@RequestMapping(value = "/boardall", method = RequestMethod.GET)
	public String boardpring(Locale locale, Model model) throws Exception{
		model.addAttribute("list", boardService.boardall());
		log.info("" + boardService.boardall());
		return "home2";
	}

}
