package com.elbicon.coderscampus.assignment10.interfaces;

import org.springframework.http.ResponseEntity;

public interface Meal <T> {
    public ResponseEntity<T> getMeal();
}