package com.mt.gmts;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
@Log4j
public class JDBCTest {

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.99.100:1521:xe","hr","hr");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@70.12.50.133:1521:xe","c##gmts","gmts");
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
