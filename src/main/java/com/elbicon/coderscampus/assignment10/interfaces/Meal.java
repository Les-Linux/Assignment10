package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.http.ResponseEntity;

public interface Meal <T> {
    public ResponseEntity<Object> getMeal(T meal);
}
