package com.wipro.medicare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.medicare.dao.LoginDAO;
import com.wipro.medicare.model.Login;



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
public Login loginService(String username) {

	Login result=loginDAO.getPasswordByUsername(username);
	return result;
	
}





}
