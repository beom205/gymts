package com.mt.gmts.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Testsb {
	
	@Autowired
	private Testsa test;
}
