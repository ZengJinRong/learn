package com.company.pattern.abstractFactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Head createHead() {
        return new CatHead();
    }

    @Override
    public Body createBody() {
        return new CatBody();
    }

    @Override
    public Tail createTail() {
        return new CatTail();
    }
}
