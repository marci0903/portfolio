package com.javabrains.portfoliotracker.services;

import com.javabrains.portfoliotracker.model.Record;

import java.util.List;

public interface RecordService {
    public Record saveRecord(Record record);
    public List<Record> getAllRecord();
}
