package com.phase3.project.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.phase3.project.model.PurchaseReport;
import com.phase3.project.model.Purchased_List;


public interface PurchaseService {
	List<Purchased_List> getPurchaseList(java.sql.Date sqlDate,String categpry);



}
