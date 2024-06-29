package classwork41.treeset;

import java.util.TreeSet;

public class TreeSetExampleString {
    public static void main(String[] args) {
        // Create TreeSet
        TreeSet<String> rivers = new TreeSet<>();
        rivers.add("Volga");
        rivers.add("Rhein");
        rivers.add("Desna");
        rivers.add("Kama");
        rivers.add("Ural");
        rivers.add("Main");
        rivers.add("Lech");
        rivers.add("Dnepr");
        rivers.add("Ural");
        rivers.add("Volga");
        rivers.add("Lech");

        //print element
        System.out.println(rivers);

        System.out.println(rivers.first());
        System.out.println(rivers.last());
        System.out.println("--------------------");
        System.out.println(rivers.floor("M"));
        System.out.println(rivers.ceiling("M"));
        System.out.println("---------------------");
        System.out.println(rivers.contains("Don"));




    }
}
