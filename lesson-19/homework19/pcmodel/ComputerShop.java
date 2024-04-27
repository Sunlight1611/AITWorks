package homework19.pcmodel;

import java.util.Arrays;
import java.util.Objects;

public class ComputerShop extends Computer{
    private Computer[] stock;
    private String shopName;

    public ComputerShop(Computer[] stock, String shopName) {
        super();
        this.stock = stock;
        this.shopName = shopName;
    }

    public Computer[] getStock() {
        return stock;
    }

    public void setStock(Computer[] stock) {
        this.stock = stock;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerShop that)) return false;
        return Arrays.equals(stock, that.stock) && Objects.equals(shopName, that.shopName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(shopName);
        result = 31 * result + Arrays.hashCode(stock);
        return result;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "stock=" + Arrays.toString(stock) +
                ", shopName='" + shopName + '\'' +
                '}';
    }

    public void showAllComputers() {
    }

    public Computer buy(int i, String number) {
        return null;
    }
}