package com.mt.gmts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.gmts.dao.SampleRepository;

@Service
public class SampleService implements ISampleService{

	@Autowired
	SampleRepository sampleRepository;
	
	@Override
	public String getEmployee(int employeeId) {
		
		return sampleRepository.getEmployee(employeeId);
	}
	

}
