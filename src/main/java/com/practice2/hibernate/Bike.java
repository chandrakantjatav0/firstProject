package com.practice2.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="bike_name")
	private String Bike_Name;
	private float Bike_Price;

	public Bike(int id, String bike_Name, float bike_Price) {
		super();
		this.id = id;
		Bike_Name = bike_Name;
		Bike_Price = bike_Price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBike_Name() {
		return Bike_Name;
	}

	public void setBike_Name(String bike_Name) {
		Bike_Name = bike_Name;
	}

	public float getBike_Price() {
		return Bike_Price;
	}

	public void setBike_Price(float bike_Price) {
		Bike_Price = bike_Price;
	}

	public Bike() {

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", Bike_Name=" + Bike_Name + ", Bike_Price=" + Bike_Price + "]";
	}

}