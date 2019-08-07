package org.hibernatepractice.karthik.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import SamplePractice.ManyMobile;
import SamplePractice.SampleAddress;
import SamplePractice.SampleUser;
import SamplePractice.VehicleOne;


public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleUser u1 = new SampleUser();
		VehicleOne vo = new VehicleOne();
		VehicleOne vo1 = new VehicleOne();
		
	
		
		
		u1.setUserFirst("Karthik");
		u1.setUserLast("Krishna");
		SampleAddress offsampleaddr = new SampleAddress();
		SampleAddress homesampleaddr1 = new SampleAddress();
		offsampleaddr.setState("Karnataka");
		offsampleaddr.setCity("Bangalore");
		homesampleaddr1.setState("TAMILNADU");
		homesampleaddr1.setCity("SHOLINGUR");
		u1.setHomeaddr(homesampleaddr1);
		u1.setOffaddr(offsampleaddr);
		vo.setVehiclename("JEEP");
		vo1.setVehiclename("VAN");
		
		u1.getGetvehicleone().add(vo);
		u1.getGetvehicleone().add(vo1);
		vo.setSampleuser(u1);
		vo1.setSampleuser(u1);
		
		
		ManyMobile manymob1 = new ManyMobile();
		ManyMobile manymob2 = new ManyMobile();
		
		manymob1.setMobName("NOKIA");
		manymob2.setMobName("SAMSUNG");
		
		u1.getManymobile().add(manymob1);
		u1.getManymobile().add(manymob2);
		
		manymob1.getGetmobuserName().add(u1);
		manymob2.getGetmobuserName().add(u1);
		
		
		
		
		//u1.setVehicleone(vo);
		
		//u1.setSamepleaddress(sampleaddr);
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(u1);
		session.save(vo);
		session.save(vo1);
		session.save(manymob1);
		session.save(manymob2);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
