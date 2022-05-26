package com.phase3.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.project.dao.LoginDAO;
import com.phase3.project.dao.UsersListDAO;
import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.Products;
import com.phase3.project.model.UserList;

@Service
public class UserListServiceImpl implements UserListService{
	
@Autowired
private UsersListDAO usersListDAO;

public UsersListDAO getUsersListDAO() {
	return usersListDAO;
}

public void setUsersListDAO(UsersListDAO usersListDAO) {
	this.usersListDAO = usersListDAO;
}

@Override
public List<UserList> getUsersList() {
List<UserList> users=(List<UserList>) usersListDAO.findAll();
	
	return users;
	
}




}
