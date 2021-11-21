package com.elbicon.coderscampus.assignment10.web;

import com.elbicon.coderscampus.assignment10.dto.DayMeals;
import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import com.elbicon.coderscampus.assignment10.interfaces.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.elbicon.coderscampus.assignment10.services.MealFactoryService;


@RestController
public class MealPlannerController implements Meals<Object> {

    @Value("${api.key}")
    String key;

    @Value("${api.endpoint}")
    String apiEndpoint;

    @Autowired
    MealFactoryService mealFactoryService;

    @Override
    @GetMapping("/mealplanner/week")
    public ResponseEntity<Object> getWeekMeals(String numCalories, String diet, String exclusions) {
        return null;
    }

    @Override
    @GetMapping("mealplanner/day")
    public ResponseEntity<Object> getDayMeals(String numCalories, String diet, String exclusions) {
        MealType mealType = mealFactoryService.getMealType(Integer.valueOf(numCalories),
                                               diet,
                                               exclusions);
        ResponseEntity<?> meal = mealFactoryService.getMeal(mealType);
        return null;
    }
}
