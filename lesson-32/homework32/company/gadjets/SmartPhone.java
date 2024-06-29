package homework32.company.gadjets;

import java.util.Objects;

public class SmartPhone extends Laptop{
    public String operationSystem;
    public double discount;


    public SmartPhone(String brand, int id, int ram, long serialNumber,
                      double price, double displaySize, double weight, int batteryCapacity,
                      String operationSystem) {
        super(brand, id, ram, serialNumber, price, displaySize, weight, batteryCapacity);
        this.promo = false;
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operationSystem='" + operationSystem + '\'' +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(discount, that.discount) == 0 && Objects.equals(operationSystem, that.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), operationSystem, discount);
    }
}
