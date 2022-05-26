package com.phase3.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.project.dao.LoginDAO;
import com.phase3.project.dao.ProductDAO;
import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.PasswordChange;
import com.phase3.project.model.Products;
import com.phase3.project.model.PurchaseReport;

@Service
public class ProductServicesImpl implements ProductServices{
	
@Autowired
private ProductDAO productDAO;


public ProductDAO getProductDAO() {
	return productDAO;
}


public void setProductDAO(ProductDAO productDAO) {
	this.productDAO = productDAO;
}


@Override
public List<Products> getListofProducts() {

	List<Products> products=(List<Products>) productDAO.findAll();
	
	return products;
	}





@Override
public void addProduct(Products product) {
	  productDAO.save(product);
	
}


@Override
public void deleteProduct(String productId) {
	
	productDAO.deleteById(Integer.parseInt(productId));
	
}


@Override
public Optional<Products> getProductById(String productId) {
	return productDAO.findById(Integer.parseInt(productId));
}


@Override
public void editProduct(Products product) {
		/*
		 * Products p = productDAO.findById(product.getProductid()).get();
		 * 
		 * p.setBrand(product.getBrand()); p.setCategory(product.getCategory());
		 * p.setGender(product.getGender()); p.setPrice(product.getPrice());
		 * p.setProduct_desc(product.getProduct_desc());
		 * p.setProductname(product.getProductname()); productDAO.save(p);
		 */
	productDAO.save(product);
	
	
}





}
