package CascadeTypes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class CasCadeUser {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userID;
	
	private String userName;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private Collection<CasCadeVehicle> cascadevehicle = new ArrayList<CasCadeVehicle>();

	public int getUserID() {
		return userID;
	}

	public Collection<CasCadeVehicle> getCascadevehicle() {
		return cascadevehicle;
	}

	public void setCascadevehicle(Collection<CasCadeVehicle> cascadevehicle) {
		this.cascadevehicle = cascadevehicle;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
