package com.mt.gmts.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mt.gmts.model.board_dto;

@Repository
public class BoardRepository implements IBoardRepository{

	@Autowired
	private com.mt.gmts.mapper.boardMapper boardMapper;

	@Override
	public int getUno(String id) throws Exception {
		return boardMapper.getUno(id);
		
	}

	@Override
	public int getGno(String name) throws Exception {
		return boardMapper.getGno(name);
	}

	@Override
	public board_dto getAll(int uno) throws Exception {
		return boardMapper.getAll(uno);
	}

	@Override
	public void setboard(board_dto board_dto) throws Exception {
		boardMapper.setboard(board_dto);
		
	}

	@Override
	public List<board_dto> boardall() throws Exception {
		return boardMapper.boardall();
	}

}
