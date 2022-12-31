package com.javabrains.portfoliotracker.model;

import com.javabrains.portfoliotracker.enums.TypeEnum;

import javax.persistence.*;

@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Date;
    private String Source;
    private String Description;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private TypeEnum type;

    public Record() {
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return Date;
    }

    public String getSource() {
        return Source;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getAmount() {
        return amount;
    }



    public TypeEnum getType() {
        return type;
    }




}
