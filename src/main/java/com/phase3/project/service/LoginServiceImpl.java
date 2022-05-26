package com.phase3.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.project.dao.LoginDAO;
import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.PasswordChange;
import com.phase3.project.model.Products;

@Service
public class LoginServiceImpl implements LoginService{
	
@Autowired
private LoginDAO loginDAO;
public LoginDAO getLoginDAO() {
	return loginDAO;
}
public void setLoginDAO(LoginDAO loginDAO) {
	this.loginDAO = loginDAO;
}
@Override
public String loginService(AdminLogin adminLogin) {

	String result=loginDAO.getPasswordByUsername(adminLogin);
	return result;
	
}
@Override
public void changepassword(PasswordChange password) {
	AdminLogin al=new AdminLogin();
	
	al.setUsername(password.getUsername());
	al.setPassword(password.getNewpassword());
loginDAO.save(al);
	
}




}
