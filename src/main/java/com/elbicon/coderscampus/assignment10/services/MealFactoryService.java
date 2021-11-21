package com.elbicon.coderscampus.assignment10.services;

import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MealFactoryService {


    public MealType getMealType (Integer numCalories,
                                 String diet,
                                 String exclusions){

        return new MealTypeImpl(numCalories,diet,exclusions);
    }

    public ResponseEntity<?> getMeal(MealType mealType){
        MealService mealService = new MealService();
        return mealService.getMeal(mealType);
    }
}
