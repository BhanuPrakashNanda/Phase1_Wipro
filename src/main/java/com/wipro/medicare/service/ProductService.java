package com.wipro.medicare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.medicare.model.Product;


public interface ProductService {
	List<Product> listAll(String keyword);

	Optional<Product> getProduct(int id);

	List<Product> getListofProducts();


	Product saveOrUpdateShop(Product p);

	void deleteProduct(Product product);
}

	
