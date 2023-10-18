package ru.kurkin;

import ru.kurkin.model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        var cityInDistrict = new HashMap<String, Set<City>>();
        var scanner = new Scanner(new File("src/main/resources/Задача ВС Java Сбер.csv"));
        while (scanner.hasNext()) {
            var strings = scanner.nextLine().split(";");
            //242 строка без 6 значения??????
            if (strings.length < 6) {
                strings = Arrays.copyOf(strings, 6);
                strings[5] = null;
            }
            var city = new City(
                    Integer.parseInt(strings[0]),//id
                    strings[1],//название города
                    strings[2],//регион
                    strings[3],//федеральный округ
                    Integer.parseInt(strings[4]),//популяция
                    strings[5]);//дата основания
            var cities = cityInDistrict.getOrDefault(city.getRegion(), new HashSet<>());
            cities.add(city);
            cityInDistrict.put(city.getRegion(), cities);
        }
        for (var entry : cityInDistrict.entrySet()) {
            var region = entry.getKey();
            var cities = entry.getValue();
            System.out.printf("%s - %s%n", region, cities.size());
        }
    }
}