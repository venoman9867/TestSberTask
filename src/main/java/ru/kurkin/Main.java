package ru.kurkin;

import ru.kurkin.model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<City> cityList = new LinkedList<>();//Использую линкед потому что в него вставка быстрее чем в arrayList
        Scanner scanner = new Scanner(new File("src/main/resources/Задача ВС Java Сбер.csv"));
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(";");
            if (strings.length < 6) {
                strings = Arrays.copyOf(strings, 6);
                strings[5] = null;
            }
            City city = new City(
                    Integer.parseInt(strings[0]),
                    strings[1],
                    strings[2],
                    strings[3],
                    Integer.parseInt(strings[4]),
                    strings[5]);
            cityList.add(city);
        }
        cityList.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
        cityList.forEach(System.out::println);
    }
}