package com.company.pattern.strategy;

public class WalkStrategy implements CommuteStrategy{
    @Override
    public void execute() {
        System.out.println("Walk");
    }
}
