package OneToOne;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
public class OneToOneUser {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	/*@OneToOne
	@JoinColumn(name="VEHICLE_ID")*/
	
	@OneToMany(mappedBy="OneUserName")
	/*@JoinTable(name=("USER_VEHICLE"),joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	private Collection<OneToOneVehicle> oneVehicle = new ArrayList<OneToOneVehicle>();
	
/*	public OneToOneVehicle getOneVehicle() {
		return oneVehicle;
	}
	public void setOneVehicle(OneToOneVehicle oneVehicle) {
		this.oneVehicle = oneVehicle;
	}*/
	
	
	public int getUserId() {
		return userId;
	}
	public Collection<OneToOneVehicle> getOneVehicle() {
		return oneVehicle;
	}
	public void setOneVehicle(Collection<OneToOneVehicle> oneVehicle) {
		this.oneVehicle = oneVehicle;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
