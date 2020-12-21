package com.company.pattern.abstractFactory;

public final class App {
    private App() {
    }

    public static void main(String[] args){
        AnimalFactory catFactory = FactoryProducer.makeFactory(FactoryProducer.AnimalType.CAT);
        catFactory.createHead().getDescription();
        catFactory.createBody().getDescription();
        catFactory.createTail().getDescription();

        AnimalFactory dogFactory = FactoryProducer.makeFactory(FactoryProducer.AnimalType.DOG);
        dogFactory.createHead().getDescription();
        dogFactory.createBody().getDescription();
        dogFactory.createTail().getDescription();
    }
}
