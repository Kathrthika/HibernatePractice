package org.hibernatepractice.karthik.dto;

import javax.persistence.Embeddable;

@Embeddable

public class SchoolAddress {
	private String schoolState;
	private String schoolCity;
	public String getSchoolState() {
		return schoolState;
	}
	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}
	public String getSchoolCity() {
		return schoolCity;
	}
	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

}
