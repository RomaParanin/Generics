package main.java.utils;

import main.java.entity.Address;
import main.java.entity.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserInformationGenerator {
    private Random random = new Random();
    private List<String> names = new ArrayList<>();
    {
        names.add("Василий");
        names.add("Людмила");
        names.add("Сергей");
        names.add("Василина");
        names.add("Александр");
        names.add("Александра");
        names.add("Петр");
        names.add("Анна");
        names.add("Ярослав");
        names.add("Яна");
    }
    private List<String> cities = new ArrayList<>();
    {
        cities.add("Тольятти");
        cities.add("Самара");
        cities.add("Нижний Новгород");
        cities.add("Ярославль");
        cities.add("Архангельск");
        cities.add("Санкт-Петербург");
        cities.add("Владивосток");
        cities.add("Саратов");
        cities.add("Екатеринбург");
        cities.add("Калининград");
    }
    private List<String> streets = new ArrayList<>();
    {
        streets.add("Советская");
        streets.add("Ленина");
        streets.add("Юбилейная");
        streets.add("Пушкина");
        streets.add("Мира");
        streets.add("Адмиралтейская");
        streets.add("Крауля");
        streets.add("Бабушкина");
        streets.add("Буденого");
        streets.add("Гоголя");
    }

    public Long getRandomId() {
        long min = 1000000000L;
        long max = 9999999999L;
        return random.nextLong() % (max - min) + max;
    }

    public String getRandomName() {
        return names.get(random.nextInt(names.size()));
    }

    public String getRandomCity() {
        return cities.get(random.nextInt(cities.size()));
    }

    public String getRandomStreet() {
        return streets.get(random.nextInt(streets.size()));
    }

    public int getRandomBuilding() {
        int min = 1;
        int max = 150;
        return random.nextInt(max - min) + min;
    }

    public int getRandomApartment() {
        int min = 1;
        int max = 560;
        return random.nextInt(max - min) + min;
    }

    public static LocalDate getRandomBirthDate() {
        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70))));
    }

    public User createUser() {
        return new User(getRandomId(), getRandomName(), getRandomBirthDate(),
                new Address(getRandomCity(), getRandomStreet(), getRandomBuilding(), getRandomApartment()));
    }


}
