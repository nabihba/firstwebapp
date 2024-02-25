package com.example.firstwebapp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Hotels")
public class hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Hotelname ;
    private String location;
    private int price_per_night;
    private String address;
    private String phoneNumber;
    public hotels(){}
    public hotels(Long id, String Hotelname, String location, int price_per_night, String address, String phoneNumber) {
        this.id = id;
        this.Hotelname = Hotelname;
        this.location = location;
        this.price_per_night = price_per_night;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelname() {
        return Hotelname;
    }

    public void setHotelname(String Hotelname) {
        this.Hotelname = Hotelname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(int price_per_night) {
        this.price_per_night = price_per_night;
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
}
