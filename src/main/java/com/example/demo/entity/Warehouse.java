package com.example.demo.entity;
//Kategoria

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDate dateOfEntry;
    private int quantity;
    private String description;

    public Warehouse(String name, int quantity, String description) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public Warehouse() {
    }

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;
}
