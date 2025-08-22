package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;

@RestController
@RequestMapping("/api/recipes")
@CrossOrigin("*")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;
    
    public RecipeController(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }
    @GetMapping
    public Page<Recipe> getData(@RequestParam (defaultValue = "1") int page,@RequestParam (defaultValue = "10")int limit){
        Pageable pageable = PageRequest.of(page,limit);
        return recipeRepository.findAll(pageable);
    }
}
