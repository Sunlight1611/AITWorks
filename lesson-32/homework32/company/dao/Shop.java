package homework32.company.dao;

import homework32.company.gadjets.Computer;

public interface Shop {

/*  - добавить компьютер addComputer
    - удалить компьютер removeComputer
    - обновить компьютер update
    - найти компьютер findComputer
    - найти компьютер со скидкой findDiscountOfComputer
    - кол-во компьютеров quantity
    - объем продаж totalSales

    - напечатать список компьютеров printComputers */

    // define abstract methods
    boolean addComputer(Computer computer);

    Computer findComputer(int id);

    Computer removeComputer(int id);

 //   Computer updateComputer(int id);

    Computer[] findComputerWithPromo();
    Computer saleComputer(int id);

    double totalSales();

    int quantity();

    void printComputers();

}
