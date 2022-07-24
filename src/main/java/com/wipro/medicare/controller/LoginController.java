package com.wipro.medicare.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.medicare.model.Login;
import com.wipro.medicare.model.Product;
import com.wipro.medicare.service.LoginService;
import com.wipro.medicare.service.ProductService;



@CrossOrigin 
@Controller
@RequestMapping(value="")
public class LoginController {
public static String user="";
@Autowired
private LoginService loginService;
@Autowired




public LoginService getLoginService() {
	return loginService;
}

public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
}


@GetMapping(value="/login")
public String login(@RequestParam String username,@RequestParam String password) {
	
	String result="";
	user=username;
	Login userDetails=loginService.loginService(username);
	if(password.contentEquals(userDetails.getPassword())){
		if(userDetails.getRole().contentEquals("user")) {
		result="home.html";
	
	}
		else {
			result="home1.html";
		}
		}
	else{
		result="error.html";
		
		
	}

	return result;
}


	
@GetMapping(value="/logout")
public ModelAndView login() {
	
	
		ModelAndView mv=new ModelAndView("logout");
		
	
	return mv;
}
	
public Date conversion(String strDate) throws ParseException {
	
	 
	
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	 java.util.Date date = sdf.parse(strDate);
	 
	 java.sql.Date sqlDate = new Date(date.getTime());
	return sqlDate;
}

	
}
