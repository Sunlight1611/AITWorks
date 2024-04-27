package homework.pets;

import homework.pets.spesies.Pets;

public class PetsAppl {
    public static void main(String[] args) {


        Pets p1 = new Pets ("1","Cat",10,"Murka");
        Pets p2 = new Pets( "2","Dog",8,"Helmut");
        Pets p3 = new Pets("3","Hamster",5,"Nikki");


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.sleep();
        p2.walk();
        p3.eat();

        System.out.println(p1);
        p1.sleep();
        System.out.println(p2);
        p2.walk();
        System.out.println(p3);
        p3.eat();


    }


    }



