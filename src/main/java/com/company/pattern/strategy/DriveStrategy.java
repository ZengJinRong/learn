package com.company.pattern.strategy;

public class DriveStrategy implements CommuteStrategy{
    @Override
    public void execute() {
        System.out.println("Drive");
    }
}
