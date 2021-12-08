package com.elbicon.coderscampus.assignment10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment10Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment10Application.class, args);

        /*
            diet examples      - Vegetarian, Vegan, Gluten Free
            exclusion examples - Primal, Paleo, Whole30
            example url
            [spoonacular]
            https://api.spoonacular.com/mealplanner/generate?apiKey=cfeee3c6913b41019d2f37fe8f9637d3&timeFrame=day&numCalories=1200&diet=Vegetarian&exclusions=tomato,cheese
            https://api.spoonacular.com/mealplanner/generate?apiKey=cfeee3c6913b41019d2f37fe8f9637d3&timeFrame=week&numCalories=1200&diet=Vegetarian&exclusions=tomato,cheese

            [localhost]
            http://localhost:8080/mealplanner/day?numCalories=1200&diet=Vegetarian&exclusions=tomato,cheese
            http://localhost:8080/mealplanner/week?numCalories=1200&diet=Vegetarian&exclusions=tomato,cheese

         */

    }

}
