package homework28;

public class CarArrayListApp {
    public static void main(String[] args) {
        CarArrayList myArray = new CarArrayList();
        myArray.add(new Car("Audi",2021));
        myArray.add(new Car("Opel",2022));
        myArray.add(new Car("BMW",2023));
        System.out.println(myArray);
        Car removedValue = myArray.remove(2);
        System.out.println("removed value: " + removedValue) ;
        System.out.println(myArray);
        System.out.println("First Value: " + myArray.get(0));
    }
}
