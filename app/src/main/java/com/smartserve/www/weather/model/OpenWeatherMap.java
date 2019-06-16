package com.smartserve.www.weather.model;

import java.util.List;

/**
 * Created by PRINCE on 9/9/2018.
 */

public class OpenWeatherMap {
    private coord coord;
    private clouds clouds;
    private main main;
    private wind wind;
    private Sys sys;
    private String base;
    private int dt;
    private int id;
    private  String name;
    private int cod;
    private List<weather> weather;


    public OpenWeatherMap() {
    }



    public OpenWeatherMap(com.smartserve.www.weather.model.coord coord, com.smartserve.www.weather.model.clouds clouds, com.smartserve.www.weather.model.main main, com.smartserve.www.weather.model.wind wind, Sys sys, String base, int dt, int id, String name, int cod, List<weather> weatherList) {
        this.coord = coord;
        this.clouds = clouds;
        this.main = main;
        this.wind = wind;
        this.sys = sys;
        this.base = base;
        this.dt = dt;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.weather = weatherList;
    }


    public com.smartserve.www.weather.model.coord getCoord() {
        return coord;
    }

    public void setCoord(com.smartserve.www.weather.model.coord coord) {
        this.coord = coord;
    }

    public com.smartserve.www.weather.model.clouds getClouds() {
        return clouds;
    }

    public void setClouds(com.smartserve.www.weather.model.clouds clouds) {
        this.clouds = clouds;
    }

    public com.smartserve.www.weather.model.main getMain() {
        return main;
    }

    public void setMain(com.smartserve.www.weather.model.main main) {
        this.main = main;
    }

    public com.smartserve.www.weather.model.wind getWind() {
        return wind;
    }

    public void setWind(com.smartserve.www.weather.model.wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public List<com.smartserve.www.weather.model.weather> getWeather() {
        return weather;
    }

    public void setWeather(List<com.smartserve.www.weather.model.weather> weather) {
        this.weather = weather;
    }
}
