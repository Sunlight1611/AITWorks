package homework20.model;

import java.math.BigInteger;

public class ComputerShop {
    private Computer[] computers;
    private int size;

    public ComputerShop(int capacity){
        this.computers = new Computer[capacity];
        this.size = 0;
    }
    public boolean addComputer(Computer computer){
        if (computer == null || size == computers.length || findComputer(computer.getMsn()) != null){
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    public Computer findComputer(BigInteger msn) {
        for (int i = 0; i < size; i++){
            if (computers[i].getMsn() == msn){
                return computers[i];
            }
        }
        return null;
    }

    public void printComputers(){
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("------------");
    }

    public int getSize() {
        return size;
    }
    public Computer removeComputer(long msn){
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if(computers[i].getMsn().longValue() == msn){
                victim = computers[i];

                computers[i] = computers[size -1];
                computers[size-1] = null;
                size--;
                break;
            }
        }
        return victim;
    }
}
