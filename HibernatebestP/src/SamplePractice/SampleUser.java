package SamplePractice;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SampleUser {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userFirst;
	private String userLast;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
		@AttributeOverride(name="city",column=@Column(name="HOME_CITY"))
	})
	private SampleAddress homeaddr;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY"))
	})
	private SampleAddress offaddr;
	
	/*@OneToOne
	@JoinColumn(name="VEHICLE_ID")*/
	
	@OneToMany(mappedBy="sampleuser")
	/*@JoinTable(name=("USER_VEHICLE1"),joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	private Collection<VehicleOne> getvehicleone = new ArrayList<VehicleOne>();	
	
	@ManyToMany
	private Collection<ManyMobile> manymobile = new ArrayList<ManyMobile>();
	
	public Collection<ManyMobile> getManymobile() {
		return manymobile;
	}
	public void setManymobile(Collection<ManyMobile> manymobile) {
		this.manymobile = manymobile;
	}
	/*public VehicleOne getVehicleone() {
		return vehicleone;
	}
	public void setVehicleone(VehicleOne vehicleone) {
		this.vehicleone = vehicleone;
	}*/
	public int getUserId() {
		return userId;
	}
	public Collection<VehicleOne> getGetvehicleone() {
		return getvehicleone;
	}
	public void setGetvehicleone(Collection<VehicleOne> getvehicleone) {
		this.getvehicleone = getvehicleone;
	}
	/*public SampleAddress getSamepleaddress() {
		return samepleaddress;
	}
	public void setSamepleaddress(SampleAddress samepleaddress) {
		this.samepleaddress = samepleaddress;
	}*/
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirst() {
		return userFirst;
	}
	public void setUserFirst(String userFirst) {
		this.userFirst = userFirst;
	}
	public String getUserLast() {
		return userLast;
	}
	public SampleAddress getHomeaddr() {
		return homeaddr;
	}
	public void setHomeaddr(SampleAddress homeaddr) {
		this.homeaddr = homeaddr;
	}
	public SampleAddress getOffaddr() {
		return offaddr;
	}
	public void setOffaddr(SampleAddress offaddr) {
		this.offaddr = offaddr;
	}
	public void setUserLast(String userLast) {
		this.userLast = userLast;
	}
	

}
