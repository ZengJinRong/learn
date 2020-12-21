package com.company.pattern.abstractFactory;

public class DogFactory implements AnimalFactory {
    @Override
    public Head createHead() {
        return new DogHead();
    }

    @Override
    public Body createBody() {
        return new DogBody();
    }

    @Override
    public Tail createTail() {
        return new DogTail();
    }
}
