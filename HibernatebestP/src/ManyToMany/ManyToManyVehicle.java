package ManyToMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyToManyVehicle {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vehicleName;
	
	
	@ManyToMany(mappedBy="manytomanyvehicle")
	private Collection<ManyToManyUser> manytomanyuser = new ArrayList<>();

	public int getVehicleId() {
		return vehicleId;
	}

	
	public Collection<ManyToManyUser> getManytomanyuser() {
		return manytomanyuser;
	}


	public void setManytomanyuser(Collection<ManyToManyUser> manytomanyuser) {
		this.manytomanyuser = manytomanyuser;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
