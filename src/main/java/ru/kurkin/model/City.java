package ru.kurkin.model;

import java.util.Objects;

public class City {
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

    public String getDistrict() {
        return district;
    }

    public int getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "', region='" + region + "', district='" + district + "', population=" + population + ", foundation='" + foundation + "'}";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        City city = (City) obj;
        //Численные типы проверяются быстрее всего
        return id == city.getId() && population == city.getPopulation()
                && (name == city.getName() || name != null && name.equals(city.getName()))
                && (region == city.getRegion() || region != null && region.equals(city.getRegion()))
                && (district == city.getDistrict() || district != null && district.equals(city.getDistrict()))
                && (foundation == city.getFoundation() || foundation != null && foundation.equals(city.getFoundation()));
    }
    @Override
    public int hashCode() {
        return Objects.hash(id,name,region,district,population,foundation);
    }
}

