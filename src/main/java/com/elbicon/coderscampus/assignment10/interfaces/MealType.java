package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.stereotype.Component;

@Component
public interface MealType {
    String getDiet();

    Integer getMaxCalories();

    String getExcludeIngredients();

    void setDiet(String diet);

    void setMaxCalories(Integer maxCalories);

    void setExcludeIngredients(String excludeIngredients);
}
