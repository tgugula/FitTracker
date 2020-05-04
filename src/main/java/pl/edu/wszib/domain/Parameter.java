package pl.edu.wszib.domain;

import java.time.LocalDateTime;

public class Parameter {
    private long id;
    private int foots;
    private double dailyWeight;
    private LocalDateTime date;
    private int water;
    private int coffeine;
    private int calories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFoots() {
        return foots;
    }

    public void setFoots(int foots) {
        this.foots = foots;
    }

    public double getDailyWeight() {
        return dailyWeight;
    }

    public void setDailyWeight(double dailyWeight) {
        this.dailyWeight = dailyWeight;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffeine() {
        return coffeine;
    }

    public void setCoffeine(int coffeine) {
        this.coffeine = coffeine;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
