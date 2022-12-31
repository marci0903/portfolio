package com.javabrains.portfoliotracker.repository;

import com.javabrains.portfoliotracker.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record,Integer> {
}
