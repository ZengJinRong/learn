package com.company.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        WeatherType[] weatherTypes = WeatherType.values();
        currentWeather = weatherTypes[(currentWeather.ordinal() + 1) % weatherTypes.length];
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.onChange(currentWeather);
        }
    }
}
