package main.java.service;

import java.util.List;

public interface Service<E> {
    E getUser();
    List<E> getUsers();
    void addUser(E e);
    void addUsers(List<E> list);
}
