package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_TBL", schema="CRUD")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name", length=50, nullable=false, unique=false)
    private String name;

    @Column(name="quantity")
    private int quantity;

    @Column(name="price")
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
