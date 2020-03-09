package com.bdg.kruger.stocksapplication.exception;

public class StockNotFoundException extends RuntimeException{

    public StockNotFoundException(Long id){
        super("Could not find stock id - " + id);
    }
}
