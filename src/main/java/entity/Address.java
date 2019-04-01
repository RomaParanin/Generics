package main.java.entity;

public class Address {
    private String city;
    private String street;
    private int building;
    private int appartment;

    public Address(String city, String street, int building, int appartment) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getAppartment() {
        return appartment;
    }

    @Override
    public String toString() {
        return "Адрес пользователя: город " + city +
                ", улица " + street +
                ", дом " + building +
                ", квартира " + appartment + ".";
    }
}
