package com.mt.gmts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mt.gmts.dao.BoardRepository;
import com.mt.gmts.model.Gym;
import com.mt.gmts.model.User;
import com.mt.gmts.model.board_dto;

@Service
public class BoardService implements IBoardService {

	@Autowired
	private BoardRepository board;

	@Override
	public User getUno(String id) throws Exception {
		return board.getUno(id);
	}

	@Override
	public Gym getGno(String name) throws Exception {
		return board.getGno(name);
	}

	@Override
	public board_dto getAll(int uno) throws Exception {
		return board.getAll(uno);
	}


	@Override
	public List<board_dto> boardall() throws Exception {
		return board.boardall();
	}

	@Override
	public void setboard(com.mt.gmts.model.board board) throws Exception {
		this.board.setboard(board);
		
	}

	@Override
	public com.mt.gmts.model.board getBno(int bno) throws Exception {
		return this.board.getBno(bno);
	}

}
