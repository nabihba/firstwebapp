package com.example.firstwebapp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Locations")

public class locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String place;
    private long  fare;
    private String open_hours;
    private String reviews;
    public locations(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getFare() {
        return fare;
    }

    public void setFare(long fare) {
        this.fare = fare;
    }

    public String getOpen_hours() {
        return open_hours;
    }

    public void setOpen_hours(String open_hours) {
        this.open_hours = open_hours;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public locations(Long id, String country, String place, long fare, String open_hours, String reviews) {
        this.id = id;
        this.country = country;
        this.place = place;
        this.fare = fare;
        this.open_hours = open_hours;
        this.reviews = reviews;
    }
}
