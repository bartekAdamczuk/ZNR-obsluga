package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//kategoria
@Entity
@Getter
public class Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int dateOfEntry;
    private int quantity;

    public Devices() {
    }

    public Devices(String name, int dateOfEntry, int quantity) {
        this.name = name;
        this.dateOfEntry = dateOfEntry;
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;

}
