package com.mt.gmts;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mt.gmts.dao.SampleRepository;
import com.mt.gmts.mapper.SampleMapper;
import com.mt.gmts.mapper.TimeMapper;
import com.mt.gmts.service.SampleService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlFac;
	
	@Autowired
	private TimeMapper timeMapper;
	
	@Autowired
	private SampleMapper sampleMapper;
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@Autowired
	private SampleService sampleService;
	
	@Test
	public void testConnection() {
		
		try {
			Connection con = dataSource.getConnection();
			
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testMyBatis() {
		try {
			SqlSession session = sqlFac.openSession();
			Connection con = session.getConnection();
			
			log.info(session);
			log.info(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testSample() {
		
//		log.info(sampleRepository.getEmployee(102));
//		log.info(sampleMapper.getEmployee(102));
		log.info(sampleService.getEmployee(102));
	}
	
	@Test
	public void timeMapperTest() {
//		log.info(timeMapper.getTime());
		log.info(timeMapper.getTime2());
	}
	
}
