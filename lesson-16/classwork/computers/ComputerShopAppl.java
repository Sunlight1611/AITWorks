package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.SmartPhone1;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Computer1[] comp = new Computer1[6];

        comp[0] = new Computer1("i7", 8, 256, "Asus", 1200);
        comp[1] = new Computer1("i9", 16, 512, "Acer", 1800);
        comp[2] = new Laptop1("M2", 16, 512, "Apple MacBook", 3000, 2.15, 10, 10);
        comp[3] = new Laptop1("AMD", 64, 2000, "MCI", 3500, 3.5, 4, 4);
        comp[4] = new Laptop1("Intel", 32, 1024, "MCI", 1500, 2.5, 6, 6);
        comp[5] = new SmartPhone1("A9",64,512,"Apple iPhone 15",1500,9,0.35,12,"ioS",true);

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }

        int sumSSD = 0;
        for (int i = 0; i < comp.length; i++) {
            sumSSD = sumSSD + comp[i].getSsd();
        }

        System.out.println("Total SSD memory = " + sumSSD);

        int totalPrice = 0;
        for (int i = 0; i < comp.length; i++) {
            totalPrice += comp[i].getPrice();
        }

        System.out.println("Total price = " + totalPrice);
    }
}





