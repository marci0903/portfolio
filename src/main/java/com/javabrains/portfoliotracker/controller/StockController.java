package com.javabrains.portfoliotracker.controller;

import com.javabrains.portfoliotracker.model.StockEntity;
import com.javabrains.portfoliotracker.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock_entity")
@CrossOrigin
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("/add")
    public String add(@RequestBody StockEntity stock){
        stockService.saveStock(stock);
        return "New stock is added";
    }
    @GetMapping("/getAll")
    public List<StockEntity> list(){
        return stockService.getAllStock();
    }

}
