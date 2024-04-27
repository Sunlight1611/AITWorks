package homework19.pcmodel;

public class Computer {

    private String vendor;
    private int price;
    private double serialNumber;

    public Computer(String vendor, int price, int serialNumber) {
        this.vendor = vendor;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public Computer() {

    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}