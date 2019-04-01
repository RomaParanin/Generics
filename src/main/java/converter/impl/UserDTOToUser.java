package main.java.converter.impl;

import main.java.converter.Converter;
import main.java.dto.UserDTO;
import main.java.entity.Address;
import main.java.entity.User;

public class UserDTOToUser implements Converter<UserDTO, User> {

    @Override
    public User convert(UserDTO userDTO) {
        Address address = userDTO.getAddress();
        User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getBirthDate(),
                new Address(address.getCity(), address.getStreet(), address.getBuilding(), address.getAppartment()));
        return user;
    }
}
