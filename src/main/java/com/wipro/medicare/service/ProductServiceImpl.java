package com.wipro.medicare.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.medicare.dao.ProductDAO;
import com.wipro.medicare.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	@Override
	public List<Product> getListofProducts() {

		List<Product> products=(List<Product>) productDAO.findAll();
		
		return products;
		}
	@Override
	public Optional<Product> getProduct(int id) {
Optional<Product> product=productDAO.findById(id);
		
		return product;
	}
	
	@Override
	public Product saveOrUpdateShop(Product p) {
		if(p.getProductid()>0) {
			Optional<Product> sOptional = productDAO.findById(p.getProductid());
			 
		    Product p1 = sOptional.get();
		   p1.setActive(p.getActive());
		   p1.setCategory(p.getCategory());
		   p1.setCode(p.getCode());
		   p1.setDescription(p.getDescription());
		   p1.setImg(p.getImg());
		   p1.setName(p.getName());
		   p1.setPackaging(p.getPackaging());
		   p1.setPrice(p.getPrice());
		   p1.setQuantity(p.getQuantity());
		   p1.setSuppliername(p.getSuppliername());
		     p1= productDAO.save(p1);
			
		     return p1;
		}
		else {
			return productDAO.save(p);
		}
		
		   
		
	
		
}
	@Override
	public void deleteProduct(Product product) {
		productDAO.deleteById(product.getProductid());
		
	}
	public List<Product> listAll(String keyword){
		if(keyword!=null) {
			return productDAO.searchIgnoreCase(keyword);
		}
		return (List<Product>) productDAO.findAll();
				
	
		
	}
}

