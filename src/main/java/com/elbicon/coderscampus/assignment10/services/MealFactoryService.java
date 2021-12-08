package com.elbicon.coderscampus.assignment10.services;

import com.elbicon.coderscampus.assignment10.dto.DailyMealPlan;
import com.elbicon.coderscampus.assignment10.enums.Planner;
import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MealFactoryService {
    @Autowired
    MealService mealService;

    public ResponseEntity<?> getMeal(MealType mealType, String timeFrame) {
        /*
            return meal options based on timeFrame
            e.g. meals for a day or meals for a week
         */
        if (timeFrame.equals(Planner.DAY.getProperty())) {
            return mealService.getMeal(mealType, timeFrame);
        } else {
            return mealService.getMeal(mealType, Planner.WEEK.getProperty());
        }
    }
}
