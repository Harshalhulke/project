package com.jspider.cardekho_case_study.entity;

public class Car {
    private int car_id;
    private String car_name;
    private String fuel_type;
    private double car_price;
    private String car_brand;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public double getCar_price() {
        return car_price;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }
    public String toString() {
        return  car_id +"\t\t" + car_name + "\t\t" + fuel_type + "\t\t"
                + car_price + "\t\t" + car_brand ;
    }
}
