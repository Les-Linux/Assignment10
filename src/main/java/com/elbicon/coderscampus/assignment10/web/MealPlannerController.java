package com.elbicon.coderscampus.assignment10.web;


import com.elbicon.coderscampus.assignment10.dto.DailyMealPlan;
import com.elbicon.coderscampus.assignment10.dto.WeeklyMealPlan;
import com.elbicon.coderscampus.assignment10.enums.Planner;
import com.elbicon.coderscampus.assignment10.interfaces.Meals;
import com.elbicon.coderscampus.assignment10.services.TypeOfMeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.elbicon.coderscampus.assignment10.services.MealFactoryService;


@RestController
public class MealPlannerController implements Meals{

    @Value("${api.key}")
    String key;

    @Value("${api.endpoint}")
    String apiEndpoint;

    @Autowired
    MealFactoryService mealFactoryService;

    @Override
    @GetMapping("/mealplanner/week")
    public ResponseEntity<?> getWeekMeals(@RequestParam String numCalories,
                                                      @RequestParam String diet,
                                                      @RequestParam String exclusions) {
        /*
            a meal dto to be passed on to member
            classes to obtain meal details
            from spoonacular
        */
        TypeOfMeal typeOfMeal = new TypeOfMeal();

        /*
            get a list of weekly meals based on input parameters
         */
        ResponseEntity<?> weeklyMealPlan = mealFactoryService.getMeal(
                typeOfMeal.getMealPlan(numCalories,diet,exclusions),
                Planner.WEEK.getProperty());

        return weeklyMealPlan;

    }

    @Override
    @GetMapping("mealplanner/day")
    public ResponseEntity<?> getDayMeals(@RequestParam String numCalories,
                                                     @RequestParam String diet,
                                                     @RequestParam String exclusions) {

        /*
            a meal dto to be passed on to member
            classes to obtain meal details
            from spoonacular
         */
        TypeOfMeal typeOfMeal = new TypeOfMeal();


        /*
            get a list of daily meals based on input parameters
         */
        ResponseEntity<?> dailyMealPlan = mealFactoryService.getMeal(
                typeOfMeal.getMealPlan(numCalories,diet,exclusions),
                                         Planner.DAY.getProperty());

        return dailyMealPlan;
    }
}
