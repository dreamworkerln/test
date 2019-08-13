package ru.home.pecs.test03;

public class Vehicle {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "model='" + model + '\'' +
               '}';
    }
}