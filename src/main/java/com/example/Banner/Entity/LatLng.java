package com.example.Banner.Entity;

public class LatLng {
    private String data_type;
    private Coordinates value;

    public LatLng() {
    }


    public LatLng(String data_type, Coordinates value) {
        this.data_type = data_type;
        this.value = value;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public Coordinates getValue() {
        return value;
    }

    public void setValue(Coordinates value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LatLng{" +
                "data_type='" + data_type + '\'' +
                ", value=" + value +
                '}';
    }
}
