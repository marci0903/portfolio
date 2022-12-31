package com.javabrains.portfoliotracker.services;

import com.javabrains.portfoliotracker.model.Record;
import com.javabrains.portfoliotracker.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordRepository repo;
    @Override
    public Record saveRecord(Record record) {
        return repo.save(record);
    }

    @Override
    public List<Record> getAllRecord() {
        return repo.findAll();
    }
}
