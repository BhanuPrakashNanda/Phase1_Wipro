package com.phase3.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "user_accounts")
@EnableTransactionManagement
public class UserList {
@Id
private String username;
private String password;
private String address;
private double mobile;
private String emailid;

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getMobile() {
	return mobile;
}
public void setMobile(double mobile) {
	this.mobile = mobile;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
