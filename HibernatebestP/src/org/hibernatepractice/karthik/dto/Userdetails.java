package org.hibernatepractice.karthik.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity

public class Userdetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userID;
	
	@Column(name="USER_FIRSTNAME")
	private String userFirstName;
	
	@Column(name="USER_LASTNAME")
	private String userLastName;
	
	private boolean active;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
		@AttributeOverride(name="city",column=@Column(name="HOME_CITY"))})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY"))})
	private Address officeAddress;
	@Embedded
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_SCHOOL",
	joinColumns=@JoinColumn(name="USER_ID"))
	
	/*@GenericGenerator(name="hilo-gen", strategy="hilo")
	@CollectionId(columns = { @Column(name="SCHOOL_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	*/
	
	
	@GenericGenerator(name = "increment-gen", strategy = "increment")
	@CollectionId(columns = { @Column(name="SCHOOL_ID") }, generator = "increment-gen", type = @Type(type="long"))
	
	
	private Collection<SchoolAddress> schoolAddress = new ArrayList<SchoolAddress>();
	@OneToOne
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	private Vehicle vehicle;
	
	public boolean isActive() {
		return active;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	/*public String getAddressdt() {
		return addressdt;
	}
	public void setAddressdt(String addressdt) {
		this.addressdt = addressdt;
	}*/
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	//private String addressdt;
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	/*public String getAddress() {
		return addressdt;
	}
	public void setAddress(String addressdt) {
		this.addressdt = addressdt;
	}*/
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Transient
	private String description;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	
	public Collection<SchoolAddress> getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(Collection<SchoolAddress> schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	

}
