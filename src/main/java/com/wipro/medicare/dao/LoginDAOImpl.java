package com.wipro.medicare.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.medicare.model.Login;

@Repository
@Transactional
public class LoginDAOImpl{

		@Autowired
		private SessionFactory sessionFactory;


		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		public String getPasswordByUsername(Login adminLogin) {
			String result = null;
			try {
			Session session = sessionFactory.openSession();
			
			Login adminlogin1 = session.get(Login.class, "user1");
			
			if(adminlogin1.getPassword().equals(adminLogin.getPassword())){
				result="Sucess";
				
			}
			else {
				result="error";
			}
			session.close();
		

		

	}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return result;

		}
		
}
