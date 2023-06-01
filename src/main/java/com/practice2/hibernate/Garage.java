package com.practice2.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Bike_Showroom")
@Embeddable
public class Garage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column(nullable=false)
	private int id;

	@Column(length = 100, name = "SHOWROOM")
	private String name;

	@Column(length = 50, name = "STREET")
	private String street;

	@Column(length=45,name="CITY")
	private String city;

	@Column(name = "Is_Open")
	private boolean isOpen;

	@Column(name = "Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;

	public Garage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garage(int id, String name, String street, String city, boolean isOpen, Date addedDate) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.addedDate = addedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Garage [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", addedDate=" + addedDate + "]";
	}

}
