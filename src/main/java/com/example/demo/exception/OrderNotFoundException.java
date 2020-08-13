package com.example.demo.exception;

/**
 * @author lenovo
 */
public class OrderNotFoundException extends RuntimeException{

    public OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}