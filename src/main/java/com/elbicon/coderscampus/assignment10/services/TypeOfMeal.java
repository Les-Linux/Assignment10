package com.elbicon.coderscampus.assignment10.services;

import com.elbicon.coderscampus.assignment10.interfaces.MealType;

import java.util.function.Consumer;

public class TypeOfMeal {
    /*
        mealType - a choice of meals for a day
                   a choice of meals for a week
     */
    private final MealType mealPlan = new MealTypeImpl();

    /*
    set the meal values on the dto class
 */
    public MealType getMealPlan(String calories, String diet, String exclusions) {
        with(mealPlan, meal -> {
            meal.setMaxCalories(Integer.valueOf(calories));
            meal.setDiet(diet);
            meal.setExcludeIngredients(exclusions);
        });
        return mealPlan;
    }

    /*
    a method replicating the 'with' keyword functionality
    from other programming languages
    */
    private static <T> void with(T obj, Consumer<T> c) {
        c.accept(obj);
    }
}
