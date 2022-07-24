package com.wipro.medicare.service;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.wipro.medicare.model.Cart;
import com.wipro.medicare.model.Product;



public interface CartService {

	List<Cart> getListofProducts();
	
	Optional<Cart> getProduct(int id);

	void addProduct(Product product) throws SAXException, JAXBException;

	void deleteProduct(Cart cart);

	void updateProduct(Product product, Integer quanity);

	void updatetotal();

	void deleteproducts();

}
