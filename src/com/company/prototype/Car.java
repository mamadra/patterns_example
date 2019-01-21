package com.company.prototype;

public class Car implements Copyable {
    String name;
    int maxSpeed;
    int countStepTransmision;

    public Car(String name, int maxSpeed, int countStepTransmision) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.countStepTransmision = countStepTransmision;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", countStepTransmision=" + countStepTransmision +
                '}';
    }

    @Override
    public Object copy() {
        Car car = new Car(name, maxSpeed, countStepTransmision);
        return car;
    }
}
