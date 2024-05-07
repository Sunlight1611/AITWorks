package consultation;

public class AnimalApps {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Marsik");
        Dog dog1 = new Dog("Palkan");
        Cat cat2 = new Cat ("Murka");

        Animal[] animals ={cat1,dog1,cat2};

        for (Animal animal:animals) {
            System.out.println(animal.kind);

            if (animal.kind.equals(Cat.TYPE)){
                System.out.println("meow");
            }else if (animal.kind.equals(Dog.TYPE)){
                    System.out.println("woof");
                }

                }
        }
    }

