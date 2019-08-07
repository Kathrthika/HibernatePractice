package ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class ManyToManyUser {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String UserName;
	
	@ManyToMany
	@JoinTable(name="MTU_MTV",joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	
	private Collection<ManyToManyVehicle> manytomanyvehicle = new ArrayList<ManyToManyVehicle>();

	public Collection<ManyToManyVehicle> getManytomanyvehicle() {
		return manytomanyvehicle;
	}

	public void setManytomanyvehicle(Collection<ManyToManyVehicle> manytomanyvehicle) {
		this.manytomanyvehicle = manytomanyvehicle;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

}
