package com.bdg.kruger.stocksapplication.repository;

import com.bdg.kruger.stocksapplication.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepositoryInterface extends JpaRepository<Stock, Long> {

}
