package com.company.pattern.builder;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        KFCPackage kfcPackage1 = new KFCPackage.Builder(new Hamburger())
                .withDrink(new Milk())
                .build();
        kfcPackage1.getFood().eat();
        kfcPackage1.getDrink().drink();

        KFCPackage kfcPackage2 = new KFCPackage.Builder(new MexicanRoll())
                .withDrink(new Tea())
                .build();
        kfcPackage2.getDrink().drink();
        kfcPackage2.getFood().eat();
    }
}
