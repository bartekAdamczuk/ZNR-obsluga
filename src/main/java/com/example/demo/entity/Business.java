package com.example.demo.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "business")
    private List<Worker> workers = new ArrayList<>();

    @OneToMany(mappedBy = "business")
    private List<Warehouse> warehouses = new ArrayList<>();

    @OneToMany(mappedBy = "business")
    private List<Tool> tools = new ArrayList<>();

    @OneToMany(mappedBy = "business")
    private List<OSH> oshes = new ArrayList<>();

    @OneToMany(mappedBy = "business")
    private List<Devices> devices = new ArrayList<>();

}
