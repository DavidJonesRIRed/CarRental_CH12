package com.careerdevs.carrental.customers;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {
    private @Id @GeneratedValue Long id;
    private String name;

    public Customer (){

    }

    public Customer(String name){
        this.name = name;
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
