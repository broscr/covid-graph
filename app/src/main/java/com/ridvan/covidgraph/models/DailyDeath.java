package com.ridvan.covidgraph.models;

import androidx.annotation.NonNull;

public class DailyDeath {

    private String dayName;
    private Float dayDeaths;

    public DailyDeath(String dayName, Float dayDeaths) {
        this.dayName = dayName;
        this.dayDeaths = dayDeaths;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public Float getDayDeaths() {
        return dayDeaths;
    }

    public void setDayDeaths(Float dayDeaths) {
        this.dayDeaths = dayDeaths;
    }

    @NonNull
    @Override
    public String toString() {
        return "DailyDeath{" +
                "dayName='" + dayName + '\'' +
                ", dayDeaths=" + dayDeaths +
                '}';
    }
}
