package com.bdg.kruger.stocksapplication.controller;

import com.bdg.kruger.stocksapplication.services.StockService;
import com.bdg.kruger.stocksapplication.model.Stock;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockService stockService;

    @ApiOperation(value = "Get All the stock in the DB.")
    @GetMapping("/stocks")
    List<Stock> all() {
        return stockService.getAllStock();
    }

    @ApiOperation(value = "Add stock to the DB.")
    @PostMapping("/stocks")
    void newStock(@RequestBody Stock stock) {
    stockService.insertStock(stock);
    }

    // Single item
    @ApiOperation(value = "Find stock by ID.")
    @GetMapping("/stocks/{id}")
    Stock one(@PathVariable Long id) {
        return stockService.getStockById(id);
    }

    @ApiOperation(value = "Update stock by ID.")
    @PutMapping("/stocks/{id}")
    void replaceStock(@RequestBody Stock stock, @PathVariable Long id) {
        stockService.updateStock(stock, id);
    }

    @ApiOperation(value = "Delete stock by ID.")
    @DeleteMapping("/stocks/{id}")
    void deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
    }

}
