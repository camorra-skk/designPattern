package src.withpattern;

import src.withpattern.drivestrategy.SpecialDriveStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle() {
        super(new SpecialDriveStrategy());
    }
}
