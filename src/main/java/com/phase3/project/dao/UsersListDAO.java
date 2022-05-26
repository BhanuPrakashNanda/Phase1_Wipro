package com.phase3.project.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.UserList;

public interface UsersListDAO extends CrudRepository<UserList, String>{


	

}
