package com.mt.gmts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt.gmts.sample.Testsa;
import com.mt.gmts.sample.Testsb;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class SampleTest {
	
	@Autowired
	Testsb test;
	
	@Test
	public void test1() {
		Testsa testa = test.getTest();
		testa.setA("dddd");
		
		
		log.info(testa.getA());
	}
}
