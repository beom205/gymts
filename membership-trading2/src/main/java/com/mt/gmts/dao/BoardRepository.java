package com.mt.gmts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mt.gmts.model.Gym;
import com.mt.gmts.model.User;
import com.mt.gmts.model.board;
import com.mt.gmts.model.board_dto;

@Repository
public class BoardRepository implements IBoardRepository{

	@Autowired
	private com.mt.gmts.mapper.boardMapper boardMapper;


	@Override
	public board_dto getAll(int uno) throws Exception {
		return boardMapper.getAll(uno);
	}


	@Override
	public List<board_dto> boardall() throws Exception {
		return boardMapper.boardall();
	}

	@Override
	public void setboard(board board) throws Exception {
		boardMapper.setboard(board);
		
	}


	@Override
	public User getUno(String id) throws Exception {
		return boardMapper.getUno(id);
	}


	@Override
	public Gym getGno(String name) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.getGno(name);
	}


	@Override
	public board getBno(int bno) throws Exception {
		return boardMapper.getBno(bno);
	}


}
