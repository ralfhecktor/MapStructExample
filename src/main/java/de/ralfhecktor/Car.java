package de.ralfhecktor;

public class Car extends Vehicle {

    private String brand;

    private Car() {
        // e.g. needed for serialization.
    }

    public Car(String brand, Vehicle vehicle) {
        super(vehicle.getColor(), vehicle.getAmountOfWheels());
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
