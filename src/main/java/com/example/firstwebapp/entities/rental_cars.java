package com.example.firstwebapp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Rental cars")

public class rental_cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private String model;

    private long renting_price;

    private String  email;
    private String address;
    private String phoneNumber;
    public rental_cars(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getRenting_price() {
        return renting_price;
    }

    public void setRenting_price(long renting_price) {
        this.renting_price = renting_price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public rental_cars(Long id, String name, String model, long renting_price, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.renting_price = renting_price;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}