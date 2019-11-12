package com.mt.gmts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mt.gmts.mapper.SampleMapper;

@Repository
public class SampleRepository implements ISampleRepository {

	@Autowired
	private SampleMapper sampleMapper;
	
	@Override
	public String getEmployee(int employeeId) {
		
		return sampleMapper.getEmployee(employeeId);
	}

}
