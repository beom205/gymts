package com.mt.gmts.dao;

import java.util.List;

import com.mt.gmts.model.Gym;
import com.mt.gmts.model.User;
import com.mt.gmts.model.board;
import com.mt.gmts.model.board_dto;

public interface IBoardRepository {

	public User getUno(String id) throws Exception;
	public Gym getGno(String name) throws Exception;
	public board_dto getAll(int uno) throws Exception;
	public void setboard(board board) throws Exception;
	public List<board_dto> boardall() throws Exception;
	public board getBno(int bno) throws Exception;
	
	
}
