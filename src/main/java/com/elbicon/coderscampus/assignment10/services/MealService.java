package com.elbicon.coderscampus.assignment10.services;


import com.elbicon.coderscampus.assignment10.dto.DailyMealPlan;
import com.elbicon.coderscampus.assignment10.dto.Week;
import com.elbicon.coderscampus.assignment10.enums.Planner;
import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@Component
@PropertySource("classpath:application.properties")
public class MealService {
    @Value("${api.key}")
    public String apiKey;

    @Value("${api.endpoint}")
    private String apiEndpoint;

    public ResponseEntity<?> getMeal(MealType mealType, String timeFrame) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            URI uri = UriComponentsBuilder.fromHttpUrl(apiEndpoint)
                    .queryParam("apiKey", apiKey)
                    .queryParam("timeFrame", timeFrame)
                    .queryParam("numCalories", mealType.getMaxCalories())
                    .queryParam("diet", mealType.getDiet())
                    .queryParam("exclusions", mealType.getExcludeIngredients())
                    .build()
                    .toUri();

            if (timeFrame.equals(Planner.DAY.getProperty())) {
                return restTemplate.getForEntity(uri, DailyMealPlan.class);
            } else {
                return restTemplate.getForEntity(uri, Week.class);
            }
        } catch (Exception e) {
            System.out.println("Exception Caught - [Class]:MealService [Message]:" + e.getMessage());
        }
        return null;
    }
}
