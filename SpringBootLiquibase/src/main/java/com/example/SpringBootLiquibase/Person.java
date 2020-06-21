package com.example.SpringBootLiquibase;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String height;

    public Person() {
    }

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
