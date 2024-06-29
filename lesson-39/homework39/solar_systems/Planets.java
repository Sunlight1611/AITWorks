package homework39.solar_systems;

import java.util.Objects;

public class Planets implements Comparable<Planets> {

    private String name;
    private double distanceFromSun; // дистанция от солнца
    private double mass;
    private int numberOfSatellites; //количество спутников

    public Planets(String name, double distanceFromSun, double mass, int numberOfSatellites) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public String toString() {
        return "Planets{" + "name='" + name + '\'' + ", distanceFromSun=" + distanceFromSun + ", mass=" + mass + ", numberOfSatellites=" + numberOfSatellites + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planets)) return false;
        return Objects.equals(name, planets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Planets o) {

        return Double.compare(this.distanceFromSun, o.distanceFromSun);

    }

}


