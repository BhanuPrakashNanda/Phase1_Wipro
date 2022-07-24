package com.wipro.medicare.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.medicare.model.Order;

public interface OrderDAO extends CrudRepository<Order, Integer>{

}
