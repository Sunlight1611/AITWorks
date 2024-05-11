package classwork28.interfaces;

public class AbstractExsample1 {
}
abstract class Animal{
    abstract void makeSound();
}
abstract class Creature{
    abstract void walk();
}
//в Java запрещены делать множественные наследования
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("meow");
    }
}
