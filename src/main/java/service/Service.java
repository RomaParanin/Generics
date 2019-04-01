package main.java.service;

import java.util.List;

public interface Service<E> {
    E getUser();
    List<E> getUsers();
    void saveUser(E e);
    void saveUsers(List<E> list);
}
