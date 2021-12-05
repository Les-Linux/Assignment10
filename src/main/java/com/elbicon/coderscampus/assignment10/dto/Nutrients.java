package com.elbicon.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
    private String calories;
    private String protein;
    private String fat;
    private String carbohydrates;


    public String getCalories() {
        return calories;
    }
    @JsonProperty(value="calories")
    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getProtein() {
        return protein;
    }
    @JsonProperty(value="protein")
    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFat() {
        return fat;
    }
    @JsonProperty(value="fat")
    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }
    @JsonProperty(value="carbohydrates")
    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
