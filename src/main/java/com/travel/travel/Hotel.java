package com.travel.travel;

public class Hotel {
    private final long id;
    private final String name;
    private final String address;
    private final float price;

    public Hotel(long id, String name, String address, float price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Float getPrice() {
        return price;
    }
}