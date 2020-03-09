package com.bdg.kruger.stocksapplication.services;

import com.bdg.kruger.stocksapplication.model.Stock;
import com.bdg.kruger.stocksapplication.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StockService{

    public void insertStock(Stock stock) {
        StockRepository stockRepository = new StockRepository();
        stockRepository.insert(stock);
    }

    public void updateStock(Stock stock, Long id) {
        StockRepository stockRepository = new StockRepository();
        stockRepository.updateStock(stock, id);
    }

    public void deleteStock(Long id) {
        StockRepository stockRepository = new StockRepository();
        stockRepository.deleteById(id);
    }

    public Stock getStockById(Long id) {
        StockRepository stockRepository = new StockRepository();
        return stockRepository.getOne(id);
    }

    public List<Stock> getAllStock() {
        StockRepository stockRepository = new StockRepository();
        return stockRepository.findAll();
    }
}
