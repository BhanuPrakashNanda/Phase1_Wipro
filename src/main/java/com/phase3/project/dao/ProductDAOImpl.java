package com.phase3.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.Products;
import com.phase3.project.model.PurchaseReport;

@Repository
@Transactional
public class ProductDAOImpl {

		@Autowired
		private SessionFactory sessionFactory;


		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}
	/*
	 * public void editProduct(Products product) { Session session =
	 * sessionFactory.openSession(); session.update(product); session.flush();
	 * session.close(); }
	 */


	/*
	 * public List<PurchaseReport> getPurchaseReport(){ Query q = null;
	 * 
	 * Session session = sessionFactory.getCurrentSession(); String statement =
	 * "select p.productid, pl.username, p.productname,p.price from products p inner join purchased_list pl where p.productid=pl.productid"
	 * ; q = session.createSQLQuery(statement); List<PurchaseReport> results =
	 * q.list(); return results;
	 * 
	 * }
	 */
		
		
}
