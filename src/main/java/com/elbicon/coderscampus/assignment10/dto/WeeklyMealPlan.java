package com.elbicon.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeeklyMealPlan {

    private List<List<WeeklyMealPlan>> meals = new ArrayList<>();

    @JsonProperty("nutrients")
    private Nutrients nutrients = new Nutrients();

    public List<List<WeeklyMealPlan>> getMeals() {
        return meals;
    }

    @JsonProperty("week")
    public void setMeals(List<List<WeeklyMealPlan>> meals) {
        this.meals = meals;
    }
    public Nutrients getNutrients() {
        return nutrients;
    }
    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
