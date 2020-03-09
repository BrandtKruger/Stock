package com.bdg.kruger.stocksapplication.stock;

import com.bdg.kruger.stocksapplication.exception.InvalidStockNameException;
import com.bdg.kruger.stocksapplication.exception.InvalidmountException;
import com.bdg.kruger.stocksapplication.model.Stock;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    private Stock stock = new Stock();

    @Test
    public void getStockName() {
        stock.setStockName("Test1");
        assertEquals("Test1", stock.getStockName());
    }

    @Test
    public void getCurrentPrice() {
        stock.setCurrentPrice(2345);
        assertEquals(2345, stock.getCurrentPrice());
    }

    @Test(expected = InvalidStockNameException.class)
    public void setStockName() {

        stock.setStockName("");
    }

    @Test(expected = InvalidmountException.class)
    public void setCurrentPrice() {

        stock.setCurrentPrice(0);
    }

}