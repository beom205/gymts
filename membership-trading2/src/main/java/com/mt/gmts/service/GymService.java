package com.mt.gmts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.gmts.mapper.ShowMapMapper;
import com.mt.gmts.model.Gym;

@Service
public class GymService implements IGymService {

	@Autowired
	ShowMapMapper smMapper;
	
	@Override
	public List<Gym> searchGym(String param) {
		
		
		return smMapper.searchGym(param);
	}

}
