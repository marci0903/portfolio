package com.javabrains.portfoliotracker.repository;

import com.javabrains.portfoliotracker.model.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<StockEntity,Integer> {
}
