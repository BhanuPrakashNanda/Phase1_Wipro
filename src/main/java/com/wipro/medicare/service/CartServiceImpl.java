package com.wipro.medicare.service;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;
import com.wipro.medicare.controller.LoginController;
import com.wipro.medicare.dao.CartDAO;
import com.wipro.medicare.model.Cart;
import com.wipro.medicare.model.Product;

@Service
public class CartServiceImpl implements CartService {
@Autowired
CartDAO cartDAO;
	@Override
	public List<Cart> getListofProducts() {
List<Cart> products=(List<Cart>) cartDAO.getListofProducts(LoginController.user);
		
		return products;
	}
	@Override
	public void addProduct(Product product) throws SAXException, JAXBException {
		Cart c=new Cart();
	
		c.setImg(product.getImg());
		c.setPrice(product.getPrice());
		c.setProductname(product.getName());
		c.setQuantity(product.getQuantity());
		c.setProductid(product.getProductid());
		c.setUserid(LoginController.user);
		c.setTotal(product.getPrice()*product.getQuantity());
		c.setSubtotal(product.getPrice()*product.getQuantity());
		List<Cart> products=(List<Cart>) cartDAO.findAll();
		java.util.ListIterator<Cart> listIterator
        = products.listIterator();
		int count=0;
		while(listIterator.hasNext()) {
			Cart cart=listIterator.next();
			if(cart.getProductid()==product.getProductid()&&cart.getUserid().equals(LoginController.user)) {
				count++;
			}
			
		}
		if(count==0) {
		cartDAO.save(c);
		}
	}
	
	@Override
	public Optional<Cart> getProduct(int id) {
Optional<Cart> product=cartDAO.findById(id);
		
		return product;

	}
	@Override
	public void deleteProduct(Cart cart) {
		cartDAO.deleteById(cart.getCartid());
				
	}
	@Override
	public void updateProduct(Product product,Integer quanity) {
		List<Cart> cart=getListofProducts();
		java.util.ListIterator<Cart> listIterator
        = cart.listIterator();
		
		while(listIterator.hasNext()) {
		Cart c=listIterator.next();
		if(c.getProductid()==product.getProductid()){
			c.setQuantity(quanity);
			cartDAO.save(c);
			
		}
	
	}

}
	@Override
	public void updatetotal() {
		List<Cart> cart=getListofProducts();
		java.util.ListIterator<Cart> listIterator
        = cart.listIterator();
		int total = 0;
		while(listIterator.hasNext()) {
		Cart c=listIterator.next();
		total=total+c.getQuantity()*c.getPrice();
			cartDAO.save(c);
			
		}
		java.util.ListIterator<Cart> listIterator1
        = cart.listIterator();
		while(listIterator1.hasNext()) {
			Cart c=listIterator1.next();
			c.setTotal(total);
			c.setSubtotal(total);
				cartDAO.save(c);
				
			}
	
	}
	
	public void deleteproducts() {
		cartDAO.deleteAll();	}
		
}