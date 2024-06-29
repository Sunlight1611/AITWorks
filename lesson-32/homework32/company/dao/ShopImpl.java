package homework32.company.dao;

import homework32.company.gadjets.Computer;

public class ShopImpl implements Shop {
    // fields
    private Computer[] computers;
    private int size;
    private double totalSales = 0;

    // конструктор
    public ShopImpl(int capacity) {
        computers = new Computer[capacity];
    }

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputer(computer.getId()) != null) {
            return false;
        }
        computers[size++] = computer;
        return true;
    }

    @Override
    public Computer removeComputer(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                Computer victim = computers[i];
                computers[i] = computers[--size];
                computers[size] = null;
                return victim;
            }
        }
        return null;
    }


    @Override
    public Computer findComputer(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer[] findComputerWithPromo() {
        //count quantity of computer
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(computers[i].isPromo()){
                count++;
            }
        }
        //fill array
        Computer[] res = new Computer[count];
        for (int i = 0, j = 0; i < res.length; i++) {
            if(computers[i].isPromo()){
                res[j++] = computers[i];
            }
        }
        return res;
    }

    @Override
    public double totalSales() {
        return this.totalSales;
    }

    @Override
    public Computer saleComputer(int id){
        Computer computer = this.findComputer(id);
        this.totalSales += computer.getPrice();
        return computer;
    }

    public Computer saleComputer(){
        Computer[] computers = this.findComputerWithPromo();
        if (computers == null || computers.length == 0) {
            return null;
        }
        Computer computer = computers[0];
        this.totalSales += computer.getPrice();
        return computer;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }
}