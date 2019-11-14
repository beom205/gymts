package com.mt.gmts;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt.gmts.mapper.ShowMapMapper;
import com.mt.gmts.model.Gym;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class GymTest {

	@Autowired
	ShowMapMapper smMapper;
	
	@Test
	public void searchGymTest() {
		
		
		
		  List<Gym> gymList = null;
	         
	         gymList = smMapper.searchGym("휘트");
	         for(Gym g : gymList) {
	             System.out.println(g.getName());
	         }
	}
}
