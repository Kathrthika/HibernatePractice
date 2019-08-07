package org.hibernatemains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import CascadeTypes.CasCadeUser;
import CascadeTypes.CasCadeVehicle;

public class CasCadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CasCadeUser cuser= new CasCadeUser();
		CasCadeVehicle cvehicle1 = new CasCadeVehicle();
		CasCadeVehicle cvehicle2 = new CasCadeVehicle();
		
		cuser.setUserName("Kartika");
		cvehicle1.setVehicleName("BUS");
		cvehicle2.setVehicleName("VAN");
		
		
		cuser.getCascadevehicle().add(cvehicle1);
		cuser.getCascadevehicle().add(cvehicle2);
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.persist(cuser);
		
		session.getTransaction().commit();
		session.close();
		

	}

}
