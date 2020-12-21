package com.company.pattern.observer;

public final class App {
    private App(){
    }

    public static void main(String[] args){
        Robot robot = new Robot();
        Human ruki = new Human("Ruki");
        Human miki = new Human("Miki");

        Weather weather = new Weather();
        weather.addObserver(robot);
        weather.addObserver(ruki);
        weather.addObserver(miki);

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        weather.removeObserver(miki);

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
