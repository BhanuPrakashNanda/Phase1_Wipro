package com.phase3.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.phase3.project.model.AdminLogin;

public interface LoginDAO extends CrudRepository<AdminLogin, Integer>{
	String getPasswordByUsername(AdminLogin adminLogin);

	String changePassword(AdminLogin adminLogin, String newpassword);
	

}
