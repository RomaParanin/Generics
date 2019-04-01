package main.java.converter.impl;

import main.java.converter.Converter;
import main.java.dto.UserDTO;
import main.java.entity.Address;
import main.java.entity.User;

public class ConverterImpl implements Converter<UserDTO, User> {

    @Override
    public User convertToUser(UserDTO userDTO) {
        Address address = userDTO.getAddress();
        User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getBirthDate(),
                new Address(address.getCity(), address.getStreet(), address.getBuilding(), address.getApartment()));
        return user;
    }

    @Override
    public UserDTO convertToUserDTO(User user) {
        Address address = user.getAddress();
        UserDTO userDTO = new UserDTO(user.getId(), user.getName(), user.getBirthDate(),
                new Address(address.getCity(), address.getStreet(), address.getBuilding(), address.getApartment()));
        return userDTO;
    }
}
