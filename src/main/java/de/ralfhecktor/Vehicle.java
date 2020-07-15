package de.ralfhecktor;

public class Vehicle {

    private String color;
    private int amountOfWheels;

    protected Vehicle() {
        // e.g. needed for serialization.
    }

    @Default
    public Vehicle(String color, int amountOfWheels) {
        this.color = color;
        this.amountOfWheels = amountOfWheels;
    }

    public String getColor() {
        return color;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }
}
