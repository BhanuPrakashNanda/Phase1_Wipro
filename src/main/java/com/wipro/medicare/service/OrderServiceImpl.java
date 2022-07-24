package com.wipro.medicare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.medicare.controller.LoginController;
import com.wipro.medicare.dao.OrderDAO;
import com.wipro.medicare.model.Cart;
import com.wipro.medicare.model.Order;
import com.wipro.medicare.model.Product;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDAO orderDAO;
	@Autowired
	CartService cartService;
	@Override
	public Order addToOrders() {
		Order o=new Order();
		o.setUsername(LoginController.user);
	String pids="";
	String pnames="";
		List<Cart> p=cartService.getListofProducts();
		java.util.ListIterator<Cart> listIterator
        = p.listIterator();
		
		while(listIterator.hasNext()) {
			Cart cart=listIterator.next();
			pids=pids+","+cart.getProductid();
			pnames=pnames+","+cart.getProductname();
		}
		o.setProductname(pnames);
		o.setProductid(pids);
		orderDAO.save(o);
		
		return o;
	}

}
