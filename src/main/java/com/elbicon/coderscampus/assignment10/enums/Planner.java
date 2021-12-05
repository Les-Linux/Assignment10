package com.elbicon.coderscampus.assignment10.enums;

public enum Planner {
    DAY("day"),
    WEEK("week");

    private final String property;

    private Planner(final String property){
        this.property = property;
    }
    public String getProperty(){
        return property;
    }
}
