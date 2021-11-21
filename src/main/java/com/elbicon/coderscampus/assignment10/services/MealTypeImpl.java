package com.elbicon.coderscampus.assignment10.services;

import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import org.springframework.stereotype.Service;

public class MealTypeImpl implements MealType {
    private String diet;
    private Integer maxCalories;
    private String excludeIngredients;

    MealTypeImpl(Integer numCalories, String diet,String exclusions){
        setMaxCalories(numCalories);
        setDiet(diet);
        setExcludeIngredients(exclusions);
    }
    @Override
    public String getDiet() {
        return diet;
    }
    private void setDiet(String diet){
        this.diet = diet;
    }

    @Override
    public Integer getMaxCalories() {
        return maxCalories;
    }

    private void setMaxCalories(Integer maxCalories){
        this.maxCalories = maxCalories;
    }

    @Override
    public String getExcludeIngredients() {
        return excludeIngredients;
    }

    public void setExcludeIngredients(String excludeIngredients){
        this.excludeIngredients = excludeIngredients;
    }
}
