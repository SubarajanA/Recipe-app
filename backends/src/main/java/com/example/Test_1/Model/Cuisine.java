package com.example.Test_1.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cuisine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cuisineid;
	public Integer getCuisineid() {
		return cuisineid;
	}
	public void setCuisineid(Integer cuisineid) {
		this.cuisineid = cuisineid;
	}
	public String getCuisinename() {
		return cuisinename;
	}
	public void setCuisinename(String cuisinename) {
		this.cuisinename = cuisinename;
	}

	private String cuisinename;
	


	
}
