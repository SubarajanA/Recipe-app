package com.example.Test_1.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Dish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer dishid;
	public Integer getDishid() {
		return dishid;
	}
	public void setDishid(Integer dishid) {
		this.dishid = dishid;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstruction() {
		return instruction;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	private String dishname;
	private String description;
	private String instruction;
	private String dishtype;
	private String cusinie;
	
	public String getDishtype() {
		return dishtype;
	}
	public void setDishtype(String dishtype) {
		this.dishtype = dishtype;
	}
	public String getCusinie() {
		return cusinie;
	}
	public void setCusinie(String cusinie) {
		this.cusinie = cusinie;
	}
	private String  ingredients;


}
