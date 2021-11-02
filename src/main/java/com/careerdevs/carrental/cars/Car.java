package com.careerdevs.carrental.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

    private @Id @GeneratedValue Long id;
    private String make;
    private String model;
    private Integer year;

    public Car(){}

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(Long id, String make, String model, Integer year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String toString(){
        return String.format("Car ( id = s%, make = %s, model = %s, year = %s", id.toString(), make, model,
                year.toString());
    }
}
