package com.mt.gmts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mt.gmts.model.Login;

@Repository
public class LoginRepository implements ILoginRepository {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public String loginUser(Login login) {
		
		String password="select password from customer where id=login.getId()";
		return password;
		
	}}