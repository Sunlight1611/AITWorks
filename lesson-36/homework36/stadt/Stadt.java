package homework36.stadt;

import java.util.Objects;

public class Stadt implements Comparable<Stadt> {
    private String name;
    private int population;
    private String country;
    private double index;

    public Stadt(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Stadt{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stadt stadt)) return false;
        return Objects.equals(name, stadt.name) && Objects.equals(country, stadt.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    public int compareTo(Stadt o) {
        return Integer.compare(this.population, o.population);


    }

}
