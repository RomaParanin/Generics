package main.java.converter.impl;

import main.java.converter.Converter;
import main.java.dto.UserDTO;
import main.java.entity.Address;
import main.java.entity.User;

public class UserToUserDTO implements Converter<User, UserDTO> {

    @Override
    public UserDTO convert(User user) {
        Address address = user.getAddress();
        UserDTO userDTO = new UserDTO(user.getId(), user.getName(), user.getBirthDate(),
                new Address(address.getCity(), address.getStreet(), address.getBuilding(), address.getAppartment()));
        return userDTO;
    }

}
