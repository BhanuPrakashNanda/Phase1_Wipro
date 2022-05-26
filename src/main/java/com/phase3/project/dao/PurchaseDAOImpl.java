package com.phase3.project.dao;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.Products;
import com.phase3.project.model.PurchaseReport;
import com.phase3.project.model.Purchased_List;

@Repository
public class PurchaseDAOImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
		public List<Purchased_List> getPurchaseList(java.sql.Date date, String category) {
			String query="select * from purchased_list where category=? and purchased_date=?";
			return jdbcTemplate.query(query,getMap(),category,date);
		
		}


		
		  
		  private RowMapper<Purchased_List> getMap(){
			  // Lambda block
			  RowMapper<Purchased_List> empMap = (rs, rowNum) -> {
				  Purchased_List emp = new Purchased_List();
				  emp.setPurchaseid(rs.getInt(1));
			      emp.setUser(rs.getString(2));
			      emp.setProductid(rs.getInt(3));
			   emp.setPurchased_date(rs.getDate(4));
			      emp.setProduct(rs.getString(5));
			      emp.setCategory(rs.getString(6));
			      return emp;
			  };
			  return empMap;
			}
		}	
		
