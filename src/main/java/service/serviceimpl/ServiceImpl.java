package main.java.service.serviceimpl;

import main.java.converter.impl.ConverterImpl;
import main.java.dto.UserDTO;
import main.java.entity.User;
import main.java.repository.impl.RepositoryImpl;
import main.java.service.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service<UserDTO> {

    private RepositoryImpl repository = new RepositoryImpl();
    private ConverterImpl converter = new ConverterImpl();

    @Override
    public UserDTO getUser() {
       return converter.convertToUserDTO(repository.getUser());
    }

    @Override
    public List<UserDTO> getUsers(){
        List<UserDTO> listOfUserDTO = new ArrayList<>();
        for (User user : repository.getUsers()) {
            listOfUserDTO.add(converter.convertToUserDTO(user));
        }
        return listOfUserDTO;
    }

    @Override
    public void saveUser(UserDTO userDTO){
        repository.saveUser(converter.convertToUser(userDTO));

    }

    @Override
    public void saveUsers(List<UserDTO> userDTOList) {
        List<User> listOfUsers = new ArrayList<>();
        for (UserDTO userDTO : userDTOList) {
            listOfUsers.add(converter.convertToUser(userDTO));
        }
        repository.saveUsers(listOfUsers);
    }
}
