package com.elbicon.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class DailyMealPlan {
    @JsonProperty("meals")
    private List<Recipe> meals = new ArrayList<>();
    @JsonProperty("nutrients")
    private Nutrients nutrients = new Nutrients();

    public List<Recipe> getMeals() {
        return meals;
    }
    public void setMeals(List<Recipe> meals) {
        this.meals = meals;
    }
    public Nutrients getNutrients() {
        return nutrients;
    }
    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
