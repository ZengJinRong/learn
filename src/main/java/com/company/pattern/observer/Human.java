package com.company.pattern.observer;

public class Human implements WeatherObserver {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void onChange(WeatherType currentWeather) {
        switch (currentWeather) {
            case SNOW:
                System.out.println(name+" :Cool");
                break;
            case RAINY:
                System.out.println(name+" :aaa");
                break;
            case SUNNY:
                System.out.println(name+" :Yeah!");
                break;
        }
    }
}
