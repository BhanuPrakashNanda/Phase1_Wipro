package com.phase3.project.service;

import java.util.List;

import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.PasswordChange;
import com.phase3.project.model.Products;

public interface LoginService {
String loginService(AdminLogin adminLogin);


void changepassword(PasswordChange password);


}
