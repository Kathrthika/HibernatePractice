package org.hibernatemains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.karthik.dto.Userdetails;

public class GetUserDetails {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Userdetails user = new Userdetails();
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		user = (Userdetails)session.get(Userdetails.class, 1);
		System.out.println(user);
		System.out.println(user.getUserID()+""+user.getUserFirstName());
		

	}

}
