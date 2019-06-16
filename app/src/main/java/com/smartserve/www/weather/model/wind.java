package com.smartserve.www.weather.model;

/**
 * Created by PRINCE on 9/9/2018.
 */

public class wind {
    private double speed;
    private double deg;

    public wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}