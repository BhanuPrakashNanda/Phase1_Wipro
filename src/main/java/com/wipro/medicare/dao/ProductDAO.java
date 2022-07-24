package com.wipro.medicare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.medicare.model.Product;


@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

@Query("Select p FROM Product p WHERE CONCAT(p.name,p.category,p.suppliername,p.price,p.packaging,p.description) LIKE %?1%")
public List<Product> searchIgnoreCase(String keywory);
}
