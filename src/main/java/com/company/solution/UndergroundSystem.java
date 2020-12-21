package com.company.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 5370. 设计地铁系统
 */
public class UndergroundSystem {
    HashMap<Integer, Trip> mapCheckIn = new HashMap<>();
    HashMap<String, List<Double>> mapTime = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        Trip trip = new Trip(id, stationName, t);
        mapCheckIn.put(id, trip);
    }

    public void checkOut(int id, String stationName, int t) {
        Trip trip = mapCheckIn.get(id);
        mapCheckIn.remove(id);
        String startStation = trip.getStartStation();
        int startTime = trip.getStartTime();
        double timeCost = t - startTime;
        String key = startStation + "->" + stationName;
        if (mapTime.containsKey(key)) {
            mapTime.get(key).add(timeCost);
        } else {
            ArrayList<Double> times = new ArrayList<>();
            times.add(timeCost);
            mapTime.put(key, times);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "->" + endStation;
        return mapTime.get(key).stream().mapToDouble(x -> x).average().getAsDouble();
    }

    class Trip {
        int id;
        String startStation;
        String endStation;
        int startTime;
        int endTime;

        public Trip(int id, String startStation, int startTime) {
            this.id = id;
            this.startStation = startStation;
            this.startTime = startTime;
        }

        public int getId() {
            return id;
        }

        public String getStartStation() {
            return startStation;
        }

        public String getEndStation() {
            return endStation;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setStartStation(String startStation) {
            this.startStation = startStation;
        }

        public void setEndStation(String endStation) {
            this.endStation = endStation;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }

}
