package com.bida.shop.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "city")
    private String city;

    @Column(name = "new_post_number")
    private int newPostNumber;

    public Order(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNewPostNumber() {
        return newPostNumber;
    }

    public void setNewPostNumber(int newPostNumber) {
        this.newPostNumber = newPostNumber;
    }
}