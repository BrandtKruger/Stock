package com.bdg.kruger.stocksapplication.exception;

public class InvalidmountException extends RuntimeException {

    public InvalidmountException(Long id){
        super("Amount must be bigger than Zero for stock id - " + id);
    }
}
