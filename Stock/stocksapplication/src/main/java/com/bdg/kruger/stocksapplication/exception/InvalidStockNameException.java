package com.bdg.kruger.stocksapplication.exception;

public class InvalidStockNameException extends RuntimeException {

    public InvalidStockNameException(Long id){
        super("Invalid name entered.");
    }
}
