package com.example.Test_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Test_1.Model.Cuisine;

@Repository
public interface CuisineRepo extends JpaRepository<Cuisine,Integer> {

}
