package com.mt.gmts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mt.gmts.mapper.LoginMapper;
import com.mt.gmts.model.Login;

import lombok.extern.java.Log;

@Repository
@Log
public class LoginRepository implements ILoginRepository {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	LoginMapper loginMapper;
	
	@Override
	public Login loginUser(String id) {
		
		Login resultLogin = new Login();
		resultLogin= loginMapper.loginUser(id);
		
		return resultLogin;
		
	}}