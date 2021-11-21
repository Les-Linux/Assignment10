package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface MealType {
    String getDiet();
    Integer getMaxCalories();
    String getExcludeIngredients();

    private void setDiet(String diet) { }
    private void setMaxCalories(Integer maxCalories) {}
    private void setExcludeIngredients(String excludeIngredients) {}
}
