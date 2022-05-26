package com.phase3.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phase3.project.model.Products;


public interface ProductDAO extends CrudRepository<Products, Integer>{

	
	

	
}
