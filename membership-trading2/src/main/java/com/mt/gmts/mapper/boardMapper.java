package com.mt.gmts.mapper;

import java.util.List;

import com.mt.gmts.model.board_dto;

public interface boardMapper {
	
	public int getGno(String name) throws Exception;
	public int getUno(String id) throws Exception;
	public board_dto getAll(int uno) throws Exception;
	public void setboard(board_dto board_dto) throws Exception;
	public List<board_dto> boardall() throws Exception;
	

}
