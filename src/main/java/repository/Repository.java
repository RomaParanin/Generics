package main.java.repository;

import main.java.entity.User;

import java.util.List;

public interface Repository <E> {
    E getUser();
    List<E> getUsers();
    void saveUser(User user);
    void saveUsers(List<E> list);
}
