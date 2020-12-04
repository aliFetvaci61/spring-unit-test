package io.alifetvaci.unit.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.alifetvaci.unit.test.exceptions.NonExistingHeroException;

/**
 * Maps exceptions to HTTP codes
 * @author moises.macero
 */
@RestControllerAdvice
public class SuperHeroExceptionHandler {

    @ExceptionHandler(NonExistingHeroException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNonExistingHero() {
    }
}
