package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Kategoria
@Entity
@NoArgsConstructor
@Getter
public class OSH {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameOSH;
    private int dateOfEntryOSH;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;

}
