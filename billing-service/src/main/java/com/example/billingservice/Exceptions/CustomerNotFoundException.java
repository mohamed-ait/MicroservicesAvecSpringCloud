package com.example.billingservice.Exceptions;

public class CustomerNotFoundException extends RuntimeException{
    CustomerNotFoundException(String message){
        super(message);
    }
}
