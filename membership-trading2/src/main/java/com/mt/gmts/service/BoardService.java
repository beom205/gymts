package com.mt.gmts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mt.gmts.dao.BoardRepository;
import com.mt.gmts.model.board_dto;

@Service
public class BoardService implements IBoardService {

	@Autowired
	private BoardRepository board;

	@Override
	public int getUno(String id) throws Exception {
		return board.getUno(id);
	}

	@Override
	public int getGno(String name) throws Exception {
		return board.getGno(name);
	}

	@Override
	public board_dto getAll(int uno) throws Exception {
		return board.getAll(uno);
	}

	@Override
	public void setboard(board_dto board_dto) throws Exception {
		board.setboard(board_dto);
		
	}

}
