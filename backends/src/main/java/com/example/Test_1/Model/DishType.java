package com.example.Test_1.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class DishType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer dishtypeid;
	public Integer getDishtypeid() {
		return dishtypeid;
	}
	public void setDishtypeid(Integer dishtypeid) {
		this.dishtypeid = dishtypeid;
	}
	public String getDishtype() {
		return dishtype;
	}
	public void setDishtype(String dishtype) {
		this.dishtype = dishtype;
	}
	private String dishtype;
	
	


}
