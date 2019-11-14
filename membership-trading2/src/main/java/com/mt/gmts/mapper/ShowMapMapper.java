package com.mt.gmts.mapper;

import java.util.List;

import com.mt.gmts.model.Gym;

public interface ShowMapMapper {

	public List<Gym> searchGym(String param);
}
