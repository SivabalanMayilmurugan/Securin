package com.example.demo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;
    ObjectMapper mapper = new ObjectMapper();

    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public void loadjson(){
        try{
            File file = new File("E:\\Users\\Sivabalan\\Desktop\\XML\\demo\\src\\main\\resources\\US_recipes_null.json");
            Map<String,Recipe> map = mapper.readValue(file, new TypeReference<Map<String,Recipe>>(){ });
            List<Recipe> recipeList = new ArrayList(map.values());
            recipeRepository.saveAll(recipeList);
            System.out.println("Recipes saved");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}