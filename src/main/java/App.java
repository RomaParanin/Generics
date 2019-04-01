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

        System.out.println("***** Добавление следующих пользователей в репозиторий *****\n");

        service.saveUsers(userDTOList);

        System.out.println("\n***** Сортировка репозитория по id пользователей в порядке возрастания *****\n");
        Collections.sort(userDTOList, Comparator.comparing(UserDTO::getId));
        for (UserDTO userDTO : userDTOList){
            System.out.println(userDTO.toString());
        }

        System.out.println("\n***** Сортировка репозитория по дате рождения в порядке убывания *****\n");
        Collections.sort(userDTOList, Comparator.comparing(UserDTO::getBirthDate).reversed());
        for (UserDTO userDTO : userDTOList){
            System.out.println(userDTO.toString());
        }

        System.out.println("\n***** Сортировка репозитория по номеру квартир пользователей в порядке возрастания *****\n");
        Comparator<UserDTO> comparator = Comparator.comparing(apartment -> apartment.getAddress().getApartment());
        Collections.sort(userDTOList, comparator);
        for (UserDTO userDTO : userDTOList) {
            System.out.println(userDTO.toString());
        }
    }
}
