package homework32.company.gadjets;

import java.util.Objects;

public abstract class Computer {
    public String brand;
    public int id;
    public int ram;
    public long serialNumber;
    public double price;
    public boolean promo = false;

    public Computer(String brand, int id, int ram, long serialNumber, double price, boolean promo) {
        this.brand = brand;
        this.id = id;
        this.ram = ram;
        this.serialNumber = serialNumber;
        this.price = price;
        this.promo = promo;
    }

    public boolean isPromo() {
        return this.promo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", ram=" + ram +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return id == computer.id && ram == computer.ram && serialNumber == computer.serialNumber && Double.compare(price, computer.price) == 0 && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, id, ram, serialNumber, price);
    }
}
