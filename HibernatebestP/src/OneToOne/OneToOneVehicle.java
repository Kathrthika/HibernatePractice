package OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OneToOneVehicle {
	@Id   @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vehicleName;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private OneToOneUser OneUserName;
	
	public OneToOneUser getOneUserName() {
		return OneUserName;
	}
	public void setOneUserName(OneToOneUser oneUserName) {
		OneUserName = oneUserName;
	}
	public int getVehicleId() {
		return vehicleId;
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
