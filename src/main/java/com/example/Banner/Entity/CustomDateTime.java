package com.example.Banner.Entity;


public class CustomDateTime {
    private String data_type;
    private String value;

    public CustomDateTime() {
    }

    public CustomDateTime(String data_type, String value) {
        this.data_type = data_type;
        this.value = value;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomDateTime{" +
                "data_type='" + data_type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
