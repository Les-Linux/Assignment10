package com.elbicon.coderscampus.assignment10.services;


import com.elbicon.coderscampus.assignment10.dto.DailyMealPlan;
import com.elbicon.coderscampus.assignment10.dto.WeeklyMealPlan;
import com.elbicon.coderscampus.assignment10.enums.Planner;
import com.elbicon.coderscampus.assignment10.interfaces.MealType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

@Component
@PropertySource("classpath:application.properties")
public class MealService{
    @Value("${api.key}")
    public String apiKey;

    @Value("${api.endpoint}")
    private String apiEndpoint;

    public ResponseEntity<?> getMeal(MealType mealType, String timeFrame){
        try {
            Properties properties = new Properties();
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("resources/application.properties"));
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("IO Exception Caught: " + e.getMessage());
        }
        RestTemplate restTemplate = new RestTemplate();
        URI uri = UriComponentsBuilder.fromHttpUrl(apiEndpoint)
                                      .queryParam("apiKey", apiKey)
                                      .queryParam("timeFrame",timeFrame)
                                      .queryParam("numCalories", mealType.getMaxCalories())
                                      .queryParam("diet", mealType.getDiet())
                                      .queryParam("exclusions", mealType.getExcludeIngredients())
                                      .build()
                                      .toUri();

        ResponseEntity<?> response;
        if(timeFrame.equals(Planner.DAY.getProperty())) {
             response = restTemplate.getForEntity(uri, DailyMealPlan.class);
        } else{
             response = restTemplate.getForEntity(uri, WeeklyMealPlan.class);
        }

        return response;

    }
}
