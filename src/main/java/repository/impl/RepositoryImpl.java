package main.java.repository.impl;

import main.java.repository.Repository;
import main.java.entity.User;
import main.java.utils.UserInformationGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepositoryImpl implements Repository<User> {

    UserInformationGenerator userInfo = new UserInformationGenerator();

    @Override
    public User getUser() {
        return userInfo.createUser();
    }

    @Override
    public List<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(4 * 5); i++){
            users.add(userInfo.createUser());
        }
        return users;
    }

    @Override
    public void saveUser(User user) {
        System.out.println("Идентификационный номер: " + user.getId() + ", имя: " + user.getName() + ", дата рождения: " + user.getBirthDate() + ", " + user.getAddress());
    }

    @Override
    public void saveUsers(List<User> users) {
        for (User user : users){
            saveUser(user);
        }
    }
}
