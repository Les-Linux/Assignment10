package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.http.ResponseEntity;

public interface Meals<T> {
    T getWeekMeals(String numCalories, String diet, String exclusions);

    T getDayMeals(String numCalories, String diet, String exclusions);
}
