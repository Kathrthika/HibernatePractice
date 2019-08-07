package SamplePractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class VehicleOne {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	@Transient
	private String vehicleOne;
	
	private String vehiclename;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private SampleUser sampleuser;

	public SampleUser getSampleuser() {
		return sampleuser;
	}

	public void setSampleuser(SampleUser sampleuser) {
		this.sampleuser = sampleuser;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleOne() {
		return vehicleOne;
	}

	public void setVehicleOne(String vehicleOne) {
		this.vehicleOne = vehicleOne;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

}
