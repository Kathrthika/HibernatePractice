package CascadeTypes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CasCadeVehicle {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleID;
	
	private String vehicleName;
	
	//private Collection<CasCadeUser> cascadeuser = new ArrayList<>();

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

}
