package com.bdg.kruger.stocksapplication.model;

import com.bdg.kruger.stocksapplication.exception.InvalidStockNameException;
import com.bdg.kruger.stocksapplication.exception.InvalidmountException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(query = "select u from Stock u", name = "query_find_all_stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stockId;

    private String stockName;
    private long currentPrice;
    private LocalDateTime lastUpdate;

    public Stock(){

        this.setLastUpdate(null);
    }

    public Stock(String stockName, long currentPrice){
        this.stockName = stockName;
        this.currentPrice = currentPrice;
        this.setLastUpdate(null);
    }

    public Long getStockId() {
        return stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public void setStockName(String stockName) {

        if( stockName.length() > 0) {
            this.stockName = stockName;
        } else
        {
            throw new InvalidStockNameException(this.stockId);
        }
    }

    public void setCurrentPrice(long currentPrice) {

        if(currentPrice > 0) {
            this.currentPrice = currentPrice;
        } else
        {
            throw new InvalidmountException(this.stockId);
        }
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {

        if(lastUpdate == null){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            this.lastUpdate = now;
        } else {
            this.lastUpdate = lastUpdate;
        }
    }

    @Override
    public String toString() {
        return String.format("StockId [id=%s, name=%s, price=%s, lastUpdate=%s]", stockId, stockName, currentPrice, lastUpdate);
    }
}
