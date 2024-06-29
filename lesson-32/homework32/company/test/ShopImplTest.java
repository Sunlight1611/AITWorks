package homework32.company.test;

import homework32.company.dao.Shop;
import homework32.company.dao.ShopImpl;
import homework32.company.gadjets.Computer;
import homework32.company.gadjets.Laptop;
import homework32.company.gadjets.SmartPhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopImplTest {
    Shop shop;
    Computer[] comp;

    @BeforeEach
    void setUp() {
        shop = new ShopImpl(7);
        comp = new Computer[6];
        comp[0] = new Laptop("Asus",501,32,123_456_789_568L,2.100);
        comp[1] = new Laptop("HP",502,8,128_562_334_221L,1.200);
        comp[2] = new Laptop("Lenovo",503,8,223_334_445_556L,1.600,16,1.300,10);
        comp[3] = new Laptop("HP",504,16,253_114_484_501L,1.800,14,1.200,12);
        comp[4] = new SmartPhone("Samsung",505,8,100_200_300_400L,800,6.1,0.3,15,"Android");
        comp[5] = new SmartPhone("Nokia",506,8,300_500_800_200L,1.100,6.43,185,24,"Android");



        // необходимо добавить элементы массива в company
        for (int i = 0; i < comp.length; i++) {
            shop.addComputer(comp[i]);
        }
    }

    @Test
    void addComputer() {
        // нельзя добавить null
        assertFalse(shop.addComputer(null));

        // нельзя добавить второй раз уже имеющегося
        assertFalse(shop.addComputer(comp[1]));

        // добавляем компьютер
        Computer computer = new Laptop("Asus",34501,32,123_456_789_578L,2.100);
        assertTrue(shop.addComputer(computer));

        // проверяем кол-во после добавления
        assertEquals(7, shop.quantity());

        // нельзя превысить capacity
        Computer computer1 = new Laptop("Toshiba",507,16,111_202_564_808L,1.350);
        assertFalse(shop.addComputer(computer1));
        shop.printComputers();
    }

    @Test
    void removeComputer() {
        assertEquals(comp[1], shop.removeComputer(502));
        assertEquals(5, shop.quantity());
        shop.printComputers();
    }

    @Test
    void findComputer() {
        // find computer with id
        assertEquals(comp[1], shop.findComputer(502));

        // find computer with id
        assertNull(shop.findComputer(28738273));
    }

    @Test
    void findDiscountOfComputer() {
        // исправить
        assertEquals(comp[0], shop.findComputerWithPromo()[0]);
    }

    @Test
    void totalSales() {
        Computer comp = shop.saleComputer(502);
        assertEquals(comp.getPrice(), shop.totalSales());
    }

    @Test
    void quantity() {
        assertEquals(6, shop.quantity());
    }
}




