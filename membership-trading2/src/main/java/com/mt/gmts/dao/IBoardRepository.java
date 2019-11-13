package com.mt.gmts.dao;

import java.util.List;

import com.mt.gmts.model.board_dto;

public interface IBoardRepository {

	public int getUno(String id) throws Exception;
	public int getGno(String name) throws Exception;
	public board_dto getAll(int uno) throws Exception;
	public void setboard(board_dto board_dto) throws Exception;
	public List<board_dto> boardall() throws Exception;
}
