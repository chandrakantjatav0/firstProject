package com.practice.hibernate;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Car_Name; 
	private float Car_Price;

	public Cars(int id, String car_Name, float car_Price) {		
		Id = id;
		Car_Name = car_Name;
		Car_Price = car_Price;
	}

	public Cars() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCar_Name() {
		return Car_Name;
	}
	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}

	public float getCar_Price() {
		return Car_Price;
	}

	public void setCar_Price(float car_Price) {
		Car_Price = car_Price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Id+" : "+this.Car_Name+" : "+this.Car_Price;
	}

}
