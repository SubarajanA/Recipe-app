package com.example.Test_1.Contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test_1.Model.Cuisine;
import com.example.Test_1.Model.Dish;
import com.example.Test_1.Repository.CuisineRepo;
import com.example.Test_1.Repository.Dishrepo;

@RestController
@RequestMapping("/home")
@CrossOrigin("*")

public class MasterController {
	@Autowired
	private Dishrepo dishrepo;
	@Autowired
	private CuisineRepo cuisinerepo;
	
	@PostMapping("/addnewrecipe")
	public Dish addnewrecipe(@RequestBody Dish dish) {
		return dishrepo.save(dish);
	}
	
	
	
	
	@GetMapping("/viewrecipe")
	public List<Dish> viewrecipe() {
		return dishrepo.findAll();
	}


	@GetMapping("/viewrecipe/{id}")
	public Optional<Dish> recipebyid(@PathVariable int id) {
		Optional<Dish> dish = dishrepo.findById(id);
		return dish;
	}
	@PutMapping("/updaterecipe/{id}")
	public Dish updaterecipe(@RequestBody Dish dish,@PathVariable int id) {
		Dish olddish = recipebyid(id).orElseThrow(()->new RuntimeException("data not found"));
		if(olddish!=null) {
			if(dish.getDescription()!=null) {
				olddish.setDescription(dish.getDescription());
			}
			if(dish.getDishname()!=null) {
				olddish.setDishname(dish.getDishname());
			}
			if(dish.getDishtype()!=null) {
				olddish.setDishtype(dish.getDishtype());
			}
			if(dish.getInstruction()!=null) {
				olddish.setInstruction(dish.getInstruction());
			}
			if(dish.getIngredients()!=null) {
				olddish.setIngredients(dish.getIngredients());
			}
			return dishrepo.save(olddish);
		}
		return null;
	}
	@DeleteMapping("/removerecipe/{id}")
	public String removeby(@PathVariable int id) {
		Dish olddish = recipebyid(id).orElseThrow(()->new RuntimeException("data not found"));
		if(olddish!=null) {
			dishrepo.deleteById(id);
			return "dish deleted";
		}
		return null;
	}
}
