package org.hibernatepractice.karthik.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import OneToOne.OneToOneUser;
import OneToOne.OneToOneVehicle;

public class OneToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		
		
		OneToOneUser oneuser = new OneToOneUser();
		OneToOneVehicle Onevehicle1 = new OneToOneVehicle();
		OneToOneVehicle Onevehicle2 = new OneToOneVehicle();
		oneuser.setUserName("Karthik");
		Onevehicle1.setVehicleName("Car");
		Onevehicle2.setVehicleName("Jeep");
		Onevehicle1.setOneUserName(oneuser);
		Onevehicle2.setOneUserName(oneuser);
		oneuser.getOneVehicle().add(Onevehicle1);
		oneuser.getOneVehicle().add(Onevehicle2);
		
		
		
		session.save(oneuser);
		session.save(Onevehicle1);
		session.save(Onevehicle2);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
