package com.phase3.project.model;

public class PasswordChange {
	private String username; 
private String oldpassword;
private String newpassword;
private String confnewpassword;
public String getOldpassword() {
	return oldpassword;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public void setOldpassword(String oldpassword) {
	this.oldpassword = oldpassword;
}
public String getNewpassword() {
	return newpassword;
}
public void setNewpassword(String newpassword) {
	this.newpassword = newpassword;
}
public String getConfnewpassword() {
	return confnewpassword;
}
public void setConfnewpassword(String confnewpassword) {
	this.confnewpassword = confnewpassword;
}

}
