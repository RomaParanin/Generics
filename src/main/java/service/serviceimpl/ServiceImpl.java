package main.java.service.serviceimpl;

import main.java.converter.impl.UserDTOToUser;
import main.java.converter.impl.UserToUserDTO;
import main.java.dto.UserDTO;
import main.java.entity.User;
import main.java.repository.impl.RepositoryImpl;
import main.java.service.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service<UserDTO> {

    private RepositoryImpl repository = new RepositoryImpl();
    private UserToUserDTO userToUserDTO = new UserToUserDTO();
    private UserDTOToUser userDTOToUser = new UserDTOToUser();

    @Override
    public UserDTO getUser() {
       return userToUserDTO.convert(repository.getUser());
    }

    @Override
    public List<UserDTO> getUsers(){
        List<UserDTO> listOfUserDTO = new ArrayList<>();
        for (User user : repository.getUsers()) {
            listOfUserDTO.add(userToUserDTO.convert(user));
        }
        return listOfUserDTO;
    }

    @Override
    public void addUser(UserDTO userDTO){
        repository.addUser(userDTOToUser.convert(userDTO));

    }

    @Override
    public void addUsers(List<UserDTO> list) {
        List<User> listOfUsers = new ArrayList<>();
        for (UserDTO userDTO : list) {
            listOfUsers.add(userDTOToUser.convert(userDTO));
        }
        repository.addUsers(listOfUsers);
    }
}
