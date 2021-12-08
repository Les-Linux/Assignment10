package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.http.ResponseEntity;

public interface Meals {
    ResponseEntity<?> getWeekMeals(String numCalories, String diet, String exclusions);

    ResponseEntity<?> getDayMeals(String numCalories, String diet, String exclusions);
}
