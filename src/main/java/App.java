package main.java;

import main.java.dto.UserDTO;
import main.java.service.serviceimpl.ServiceImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ServiceImpl service = new ServiceImpl();
        List<UserDTO> userDTOList = service.getUsers();

        System.out.println("***** Добавление следующих пользователей в репозиторий *****");
        service.addUsers(userDTOList);

        System.out.println("***** Содержимое репозитория *****");
        for (UserDTO userDTO : userDTOList) {
            System.out.println(userDTO.toString());
        }

        System.out.println("***** Сортировка репозитория по id пользователей в порядке возрастания *****");
        Collections.sort(userDTOList, Comparator.comparing(UserDTO::getId));
        for (UserDTO userDTO : userDTOList){
            System.out.println(userDTO.toString());
        }

        System.out.println("***** Сортировка репозитория по дате рождения в порядке убывания *****");
        Collections.sort(userDTOList, Comparator.comparing(UserDTO::getBirthDate).reversed());
        for (UserDTO userDTO : userDTOList){
            System.out.println(userDTO.toString());
        }

        System.out.println("***** Сортировка репозитория по номеру квартир пользователей в порядке возрастания *****");
        Comparator<UserDTO> comparator = Comparator.comparing(appartment -> appartment.getAddress().getAppartment());
        Collections.sort(userDTOList, comparator);
        for (UserDTO userDTO : userDTOList) {
            System.out.println(userDTO.toString());
        }
    }
}
