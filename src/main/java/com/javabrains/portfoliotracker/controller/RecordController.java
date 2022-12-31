package com.javabrains.portfoliotracker.controller;

import com.javabrains.portfoliotracker.model.Record;
import com.javabrains.portfoliotracker.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record_entity")
@CrossOrigin
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping("/add")
    public String add(@RequestBody Record record){
        recordService.saveRecord(record);
        return "New record is added";
    }
    @GetMapping("/getAll")
    public List<Record> list(){
        return recordService.getAllRecord();
    }

}
