package org.hibernatepractice.karthik.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ManyToMany.ManyToManyUser;
import ManyToMany.ManyToManyVehicle;

public class ManyToManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManyToManyUser mtmu = new ManyToManyUser();
		ManyToManyVehicle mtmv1 = new ManyToManyVehicle();
		ManyToManyVehicle mtmv2 = new ManyToManyVehicle();
		
		mtmu.setUserName("Karthika");
		mtmv1.setVehicleName("CAR");
		mtmv2.setVehicleName("JEEP");
		
		mtmu.getManytomanyvehicle().add(mtmv1);
		mtmu.getManytomanyvehicle().add(mtmv2);
		
		mtmv1.getManytomanyuser().add(mtmu);
		mtmv2.getManytomanyuser().add(mtmu);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(mtmu);
		session.save(mtmv1);
		session.save(mtmv2);
		
		session.getTransaction().commit();
		session.close();
		

	}

}
