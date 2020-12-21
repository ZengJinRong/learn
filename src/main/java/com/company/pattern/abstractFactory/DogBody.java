package com.company.pattern.abstractFactory;

public class DogBody implements Body{
    @Override
    public void getDescription() {
        System.out.println("DogBody");
    }
}
