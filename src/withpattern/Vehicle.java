package src.withpattern;

import src.withpattern.drivestrategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
