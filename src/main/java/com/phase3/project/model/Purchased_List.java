package com.phase3.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;
@Entity
@Table(name = "purchased_list")
@EnableTransactionManagement
public class Purchased_List {
@Id
private int purchaseid;
private String user;
private int productid;
private Date purchased_date;
private String product;
private String category;

public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPurchaseid() {
	return purchaseid;
}
public void setPurchaseid(int purchaseid) {
	this.purchaseid = purchaseid;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public Date getPurchased_date() {
	return purchased_date;
}
public void setPurchased_date(Date purchased_date) {
	this.purchased_date = purchased_date;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}


}
