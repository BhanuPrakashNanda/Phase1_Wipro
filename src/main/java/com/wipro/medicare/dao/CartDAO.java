package com.wipro.medicare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.medicare.model.Cart;
import com.wipro.medicare.model.Product;

@Repository
public interface CartDAO extends CrudRepository<Cart,Integer>{
	@Query("Select p FROM Cart p WHERE p.userid LIKE %?1%")
	public List<Cart> getListofProducts(String user);

	
	
}
