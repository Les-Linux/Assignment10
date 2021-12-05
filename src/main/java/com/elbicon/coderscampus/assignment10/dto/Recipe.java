package com.elbicon.coderscampus.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipe {
     private Integer id;
     private String imageType;
     private String title;
     private Integer readyInMinutes;
     private Integer servings;
     private String sourceUrl;

    public Integer getId() {
        return id;
    }
    @JsonProperty(value="id")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageType() {
        return imageType;
    }
    @JsonProperty(value="imageType")
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getTitle() {
        return title;
    }
    @JsonProperty(value="title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReadyInMinutes() {
        return readyInMinutes;
    }
    @JsonProperty(value="readyInMinutes")
    public void setReadyInMinutes(String readyInMinutes) {
        this.readyInMinutes = Integer.valueOf(readyInMinutes);
    }

    public Integer getServings() {
        return servings;
    }
    @JsonProperty(value="servings")
    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }
    @JsonProperty(value="sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
