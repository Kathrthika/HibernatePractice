package SamplePractice;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ManyMobile {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int mobId;
	
	
	private String mobName;
	
	@ManyToMany(mappedBy="manymobile")
	private Collection<SampleUser> getmobuserName = new ArrayList<SampleUser>();

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public Collection<SampleUser> getGetmobuserName() {
		return getmobuserName;
	}

	public void setGetmobuserName(Collection<SampleUser> getmobuserName) {
		this.getmobuserName = getmobuserName;
	}

}
