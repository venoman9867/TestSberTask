package ru.kurkin.model;

public class City{
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(int id, String name, String region, String district, int population, String foundation) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Город{name='"+name+"', регион='"+region+"', район='"+district+"', население="+population+", фонд='"+foundation+"'}";
    }

}
