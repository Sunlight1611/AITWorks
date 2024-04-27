package homework.model;

import java.util.Objects;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }


    public String getMeatType() {
        return getMeatType();
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeatFood meatFood = (MeatFood) o;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meatType);
    }

    @Override
    public String toString() {
        return super.toString() + ", meatType = " + meatType;
    }
}

