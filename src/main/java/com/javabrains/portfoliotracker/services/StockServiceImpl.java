package com.javabrains.portfoliotracker.services;

import com.javabrains.portfoliotracker.model.StockEntity;
import com.javabrains.portfoliotracker.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepo repo;
    @Override
    public StockEntity saveStock(StockEntity stock) {
        return repo.save(stock);
    }

    @Override
    public List<StockEntity> getAllStock() {
        return repo.findAll();
    }
}
