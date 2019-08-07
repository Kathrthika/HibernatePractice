package org.hibernatemains;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.karthik.dto.Address;
import org.hibernatepractice.karthik.dto.SchoolAddress;
import org.hibernatepractice.karthik.dto.Userdetails;
import org.hibernatepractice.karthik.dto.Vehicle;

public class UserdetailsTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Userdetails user = new Userdetails();
		Vehicle vehicle1 = new Vehicle();
		Address hmaddr = new Address();
		Address omaddr = new Address();
		SchoolAddress school1= new SchoolAddress();
		SchoolAddress school2= new SchoolAddress();
		//user.setUserID(1);
		user.setUserFirstName("Karthik");
		user.setUserLastName("Krishna");
		user.setJoinedDate(new Date());
		//user.setAddress("Bangalore");
		user.setActive(true);
		
		user.setDescription("Learing Hibernate");
		hmaddr.setState("karnataka");
		hmaddr.setCity("Bangalore");
		
		omaddr.setCity("sholingur");
		omaddr.setState("vellore");
		
		user.setHomeAddress(hmaddr);
		user.setOfficeAddress(omaddr);
		
		vehicle1.setVehicleName("Pulsor");
		vehicle1.setVehicleNumber("KA-0001");
		
		school1.setSchoolState("tamil namdu");
		school1.setSchoolCity("TNRP");
		school2.setSchoolState("Tamilinadu");
		school2.setSchoolCity("VEDIYANGADU");
		
	user.getSchoolAddress().add(school1);
	user.getSchoolAddress().add(school2);	
	user.setVehicle(vehicle1);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
		
		/*user = null;
		session = sessionfactory.openSession();
		session.beginTransaction();
		user = (Userdetails)session.get(Userdetails.class, 1);
		System.out.println(user.getUserID()+"   "+user.getUserFirstName());
		//System.out.println(user.getHomeAddress().getCity()+"  "+user.getOfficeAddress().getState());
		//" "+user.getAddress().getCity()+" "+user.getAddress().getState());
		//session.close();
		System.out.println(user.getSchoolAddress().size());*/

	}

}
