package com.company.car;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand.toLowerCase(), car.brand.toLowerCase()) &&
                Objects.equals(model.toLowerCase(), car.model.toLowerCase()) &&
                Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand.toLowerCase(), model.toLowerCase(), year);
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Model: %s | Year: %s\n",
                this.brand,
                this.model,
                this.year);
    }
}
