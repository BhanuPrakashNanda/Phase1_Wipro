package com.phase3.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "products")
@EnableTransactionManagement
public class Products {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int productid;
private String productname;
private String product_desc;
private int price;
private String category;
private String brand;
private String gender;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProduct_desc() {
	return product_desc;
}
public void setProduct_desc(String product_desc) {
	this.product_desc = product_desc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
