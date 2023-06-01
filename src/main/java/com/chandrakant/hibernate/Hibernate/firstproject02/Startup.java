package com.chandrakant.hibernate.Hibernate.firstproject02;

import javax.persistence.Column;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table
public class Startup { // table name
	// Id, BusinessName,FounderName,BusinessValuation
	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "BusinessName")
	private String BusinessName;

	@Column(name = "FounderName")
	private String FounderName;

	@Column(name = "BusinessValuation")
	private float BusinessValuation;

	public static void main(String[] args) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessName() {
		return BusinessName;
	}

	public void setBusinessName(String BusinessName) {
		this.BusinessName = BusinessName;
	}

	public String getFounderName() {
		return FounderName;
	}

	public void setFounderName(String FounderName) {
		this.FounderName = FounderName;
	}

	public float getBusinessValuation() {
		return BusinessValuation;
	}

	public void setBusinessValuation(float BusinessValuation) {
		this.BusinessValuation = BusinessValuation;
	}

}
