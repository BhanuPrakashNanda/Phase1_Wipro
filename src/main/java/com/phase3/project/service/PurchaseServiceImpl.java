package com.phase3.project.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.project.dao.PurchaseDAOImpl;
import com.phase3.project.model.Purchased_List;

@Service
public class PurchaseServiceImpl implements PurchaseService{
	@Autowired
	private PurchaseDAOImpl purchaseDAO;
	
	

	public PurchaseDAOImpl getPurchaseDAO() {
		return purchaseDAO;
	}



	public void setPurchaseDAO(PurchaseDAOImpl purchaseDAO) {
		this.purchaseDAO = purchaseDAO;
	}



	@Override
	public List<Purchased_List> getPurchaseList(java.sql.Date date,String category) {
		return (List<Purchased_List>) purchaseDAO.getPurchaseList(date,category);
	
	}





}
