package main.java.dto;

import main.java.entity.Address;

import java.io.Serializable;
import java.time.LocalDate;

public class UserDTO implements Serializable {
    private long id;
    private String name;
    private LocalDate birthDate;
    private Address address;

    public UserDTO (long id, String name, LocalDate birthDate, Address address) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Идентификационный номер: " + id +
                ", имя: " + name +
                ", дата рождения: " + birthDate +
                ", " + address;
    }
}
