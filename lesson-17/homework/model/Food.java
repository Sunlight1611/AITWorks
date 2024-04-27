package homework.model;

import java.util.Objects;

public class Food extends Product {

    private String expDate;
    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString() + " , expDate = " + expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expDate);
    }
}
