package com.company.pattern.strategy;

public class RideStrategy implements CommuteStrategy{
    @Override
    public void execute() {
        System.out.println("Ride");
    }
}
