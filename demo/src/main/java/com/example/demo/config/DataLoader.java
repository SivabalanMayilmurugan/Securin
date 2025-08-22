package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.RecipeService;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private RecipeService recipeService;
    
    public DataLoader(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    public void run(String... args){
        recipeService.loadjson();
    }
}
