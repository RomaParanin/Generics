package main.java.entity;

public class Address {
    private String city;
    private String street;
    private int building;
    private int apartment;

    public Address(String city, String street, int building, int apartment) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
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

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Адрес пользователя: город " + city +
                ", улица " + street +
                ", дом " + building +
                ", квартира " + apartment + ".";
    }
}
