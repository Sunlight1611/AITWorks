package homework39.solar_systems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {
    public static void main(String[] args) {
        List<Planets> planetsList = new ArrayList<>();
        Planets planets = new Planets("Mercury", 58, 1.285E23, 0);
        planetsList.add(planets);
        planetsList.add(new Planets("Venus", 108, 4.867E24, 0));
        planetsList.add(new Planets("Earth", 130, 5.972, 1));
        planetsList.add(new Planets("Mars", 228, 6.39E23, 2));
        planetsList.add(new Planets("Jupiter", 778.5, 1.898E27, 79));
        planetsList.add(new Planets("Saturn", 1433.5, 5.683E26, 82));
        planetsList.add(new Planets("Uranus", 2872.5, 8.681E25, 27));
        planetsList.add(new Planets("Neptune", 4495.1, 1.024E26, 14));

        int size = planetsList.size();
        System.out.println("Number of Planets = " + size);
        System.out.println("---------- unsorted list -----------");
        for (Planets p : planetsList) {
            System.out.println(p);
        }
        int totalnumberOfSatellites = 0;
        for (Planets p : planetsList) {
            totalnumberOfSatellites += p.getNumberOfSatellites();
        }
        System.out.println("Total number of Satellites: " + totalnumberOfSatellites);
        Comparator<Planets> planetsNameComparator = new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("----------sorting by name----------");
        planetsList.sort(planetsNameComparator);
        for (Planets p : planetsList) {
            System.out.println(p);
        }
        System.out.println("---------------------------------");
        planetsList.sort(Planets::compareTo);
        System.out.println("------- sorted native list---------");
        for (Planets p : planetsList) {
            System.out.println(p);


        }
    }
}