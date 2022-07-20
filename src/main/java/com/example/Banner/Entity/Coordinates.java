package com.example.Banner.Entity;

public class Coordinates {
    private Long _latitude;
    private Long _longitude;

    public Coordinates() {

    }

    public Coordinates(Long _latitude, Long _longitude) {
        this._latitude = _latitude;
        this._longitude = _longitude;
    }

    public Long get_latitude() {
        return _latitude;
    }

    public void set_latitude(Long _latitude) {
        this._latitude = _latitude;
    }

    public Long get_longitude() {
        return _longitude;
    }

    public void set_longitude(Long _longitude) {
        this._longitude = _longitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "_latitude=" + _latitude +
                ", _longitude=" + _longitude +
                '}';
    }
}
