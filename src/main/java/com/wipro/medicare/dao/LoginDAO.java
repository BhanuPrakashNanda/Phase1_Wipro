package com.wipro.medicare.dao;

import org.springframework.data.repository.CrudRepository;


import com.wipro.medicare.model.Login;


public interface LoginDAO extends CrudRepository<Login, Integer> {
	Login getPasswordByUsername(String username);
	

	
	

}

