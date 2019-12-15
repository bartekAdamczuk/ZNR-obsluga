package com.example.demo.entity;
//Kategoria

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int phoneNumber;
    private String firstName;
    private String lastName;

    public Worker() {
    }

    public Worker(int phoneNumber, String firstName, String lastName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;

}
