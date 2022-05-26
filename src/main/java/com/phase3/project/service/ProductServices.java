package com.phase3.project.service;

import java.util.List;
import java.util.Optional;

import com.phase3.project.model.PasswordChange;
import com.phase3.project.model.Products;
import com.phase3.project.model.PurchaseReport;

public interface ProductServices {
	List<Products> getListofProducts();



	void addProduct(Products product);

	void deleteProduct(String productId);

	Optional<Products> getProductById(String productId);

	void editProduct(Products product);


}
