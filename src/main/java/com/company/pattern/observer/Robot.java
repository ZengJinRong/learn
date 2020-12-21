package com.company.pattern.observer;

public class Robot implements WeatherObserver{
    @Override
    public void onChange(WeatherType currentWeather) {
        switch (currentWeather) {
            case SUNNY:
                System.out.println("SUNNY");
                break;
            case RAINY:
                System.out.println("RAINY");
                break;
            case SNOW:
                System.out.println("SNOW");
                break;
        }
    }
}
