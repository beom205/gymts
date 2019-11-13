package com.mt.gmts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mt.gmts.model.User;

@Repository
public class UserRepository implements IUserRepository {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void registerUser(User user) {
		
		String sql = "select count(*) from customer";
		int uno = jdbcTemplate.queryForObject(sql, Integer.class);
		
		sql = "insert into customer (uno,id, password, email, phone, ad_check) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				uno,
				user.getId(), 
				user.getPassword(), 
				user.getEmail(),
				user.getPhone(),
				user.getAd_check()
	

		);
	}}