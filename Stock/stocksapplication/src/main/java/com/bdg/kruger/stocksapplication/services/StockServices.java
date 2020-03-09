package com.bdg.kruger.stocksapplication.services;

import com.bdg.kruger.stocksapplication.model.Stock;

import java.util.List;

public interface StockServices {

    void insertStock(Stock stock);
    void updateStock(Stock stock, Long id);
    void deleteStock(Long ids);
    Stock getStock(Long id);
    List<Stock> getAllStock();
}
