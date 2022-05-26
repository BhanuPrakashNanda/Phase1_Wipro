package com.phase3.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.phase3.project.model.AdminLogin;

@Repository
@Transactional
public class LoginDAOImpl {

		@Autowired
		private SessionFactory sessionFactory;


		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		public String getPasswordByUsername(AdminLogin adminLogin) {
			String result;
			Session session = sessionFactory.openSession();
			AdminLogin adminlogin1 = (AdminLogin) session.get(AdminLogin.class, adminLogin.getUsername());
			
			if(adminlogin1.getPassword().equals(adminLogin.getPassword())){
				result="Sucess";
				
			}
			else {
				result="error";
			}
			session.close();
			return result;

		

	}
		public String changePassword(AdminLogin adminLogin,String newpassword) {
			String result = null;
			Session session = sessionFactory.openSession();
			AdminLogin adminlogin1 = (AdminLogin) session.get(AdminLogin.class, adminLogin.getUsername());
			
			session.close();
			Session session1 = sessionFactory.openSession();
			if(adminlogin1.getPassword().equals(adminLogin.getPassword())){
				
				AdminLogin al=new AdminLogin();
				al.setPassword(newpassword);
				al.setUsername(adminLogin.getUsername());
				
				session1.update(al);
				
				return "success";
			}
			else {
				result="error";
			}
			session1.flush();
			session1.close();
		
			
		
			return result;

		

	}

}
