package com.company.pattern.abstractFactory;

public class FactoryProducer {
    public enum AnimalType {
        CAT, DOG,
    }

    public static AnimalFactory makeFactory(AnimalType type) {
        switch (type) {
            case CAT:
                return new CatFactory();
            case DOG:
                return new DogFactory();
            default:
                throw new IllegalArgumentException("AnimalType not supported.");
        }
    }
}
