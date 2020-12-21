package com.company.pattern.strategy;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Commuter commuter = new Commuter(new WalkStrategy());
        commuter.go();
        commuter.setCommuteStrategy(new DriveStrategy());
        commuter.go();
        commuter.setCommuteStrategy(new RideStrategy());
        commuter.go();

        commuter.setCommuteStrategy(()->System.out.println("Swim"));
        commuter.go();
        commuter = new Commuter(()->System.out.println("Fly"));
        commuter.go();
    }
}
