package com.example.Test_1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ingredientsid;
	public Integer getIngredientsid() {
		return ingredientsid;
	}
	public void setIngredientsid(Integer ingredientsid) {
		this.ingredientsid = ingredientsid;
	}
	public String getIngredientsidname() {
		return ingredientsidname;
	}
	public void setIngredientsidname(String ingredientsidname) {
		this.ingredientsidname = ingredientsidname;
	}
	private String ingredientsidname;

}
