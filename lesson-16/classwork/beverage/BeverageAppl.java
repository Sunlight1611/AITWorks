package classwork.beverage;

public class BeverageAppl {
    public static void main(String[] args) {


        Beverage b1 = new Beverage("Milk", false, "Milka", 2,"box");
        b1.toBuy("Milk", "box", 3);
        b1.displayStock();

        Beer beer = new Beer("beer",true,"Becks",2,"box",true,"white");
        beer.toBuy("beer","box",5);
        beer.displayStock();

    }
}
