package com.bdg.kruger.stocksapplication.repository;

import com.bdg.kruger.stocksapplication.model.Stock;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional

public class StockRepository implements StockRepositoryInterface {

    @PersistenceContext
    private EntityManager entityManager;
    private final StockRepositoryInterface repository;

    public StockRepository(StockRepositoryInterface repository) {
        this.repository = repository;
    }

    public StockRepository() {
        repository = null;
    }

    public void insert(Stock stock) {
        entityManager.persist(stock);
        repository.save(stock);
    }

    public void updateStock(Stock stock, Long id){
                repository.findById(id)
                .map(stockRecord -> {
                    stockRecord.setStockId(stock.getStockId());
                    stockRecord.setStockName(stock.getStockName());
                    stockRecord.setCurrentPrice(stock.getCurrentPrice());
                    stockRecord.setLastUpdate(stock.getLastUpdate());
                    return repository.save(stockRecord);
                })
                .orElseGet(() -> {
                    stock.setStockId(id);
                    return repository.save(stock);
                });

    }

    public Stock find(long id) {
        return entityManager.find(Stock.class, id);
    }

    public List< Stock > findAll() {
        Query query = entityManager.createNativeQuery(
                "query_find_all_stock", Stock.class);
        return query.getResultList();
    }

    @Override
    public List<Stock> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Stock> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Stock> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Stock stock) {

    }

    @Override
    public void deleteAll(Iterable<? extends Stock> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Stock> S save(S s) {


//        return repository.findById(id)
//                .map(stock -> {
//                    stock.setStockId(newStock.getStockId());
//                    stock.setStockName(newStock.getStockName());
//                    stock.setCurrentPrice(newStock.getCurrentPrice());
//                    stock.setLastUpdate(newStock.getLastUpdate());
//                    return repository.save(stock);
//                })
//                .orElseGet(() -> {
//                    newStock.setStockId(id);
//                    return repository.save(newStock);
//                });
        return null;
    }

    @Override
    public <S extends Stock> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Stock> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Stock> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Stock> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Stock getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Stock> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Stock> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Stock> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Stock> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Stock> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Stock> boolean exists(Example<S> example) {
        return false;
    }


}
