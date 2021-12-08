package com.elbicon.coderscampus.assignment10.services;

import com.elbicon.coderscampus.assignment10.interfaces.MealType;


public class MealTypeImpl implements MealType {
    private String diet;
    private Integer maxCalories;
    private String excludeIngredients;

    @Override
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public Integer getMaxCalories() {
        return maxCalories;
    }

    public void setMaxCalories(Integer maxCalories) {
        this.maxCalories = maxCalories;
    }

    @Override
    public String getExcludeIngredients() {
        return excludeIngredients;
    }

    public void setExcludeIngredients(String excludeIngredients) {
        this.excludeIngredients = excludeIngredients;
    }
}
