package com.javabrains.portfoliotracker.services;

import com.javabrains.portfoliotracker.model.StockEntity;

import java.util.List;

public interface StockService {
    public StockEntity saveStock(StockEntity stock);
    public List<StockEntity> getAllStock();
}
