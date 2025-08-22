package com.example.demo.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String cuisine;
    private String title;
    private String rating;
    private int total_time;
    private int prep_time;
    private int cook_time;
    
    @Lob
    private String description;

    @Lob
    private String nutrients;

    @Lob
    private List<String> serves;


   

    public List<String> getServes() {
        return serves;
    }

    public void setServes(List<String> serves) {
        this.serves = serves;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getTotal_time() {
        return total_time;
    }

    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }

    public int getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(int prep_time) {
        this.prep_time = prep_time;
    }

    public int getCook_time() {
        return cook_time;
    }

    public void setCook_time(int cook_time) {
        this.cook_time = cook_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNutrients() {
        return nutrients;
    }

    public void setNutrients(String nutrients) {
        this.nutrients = nutrients;
    }

    

}
