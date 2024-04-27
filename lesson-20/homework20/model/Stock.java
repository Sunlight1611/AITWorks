package homework20.model;

public class Stock {
    public static void main(String[] args) {
        ComputerShop stock = new ComputerShop(4);

        stock.addComputer(new Computer("HP","i5",16, 1_000_000_000_000_000_00L));
        stock.addComputer(new Computer("Toshiba", "i7",32,2_000_000_000_000_000_00L));
        stock.addComputer(new Computer ("Apple","i9",64,3_000_000_000_000_000_00L));
        System.out.println(stock.getSize());
        stock.printComputers();

        stock.addComputer(new Computer("Aser","Z",64,4_000_000_000_000_000_00L));
        System.out.println(stock.getSize());
        stock.printComputers();

        stock.removeComputer(200_000_000_000_000_000L);
        System.out.println(stock.getSize());
        stock.printComputers();
    }
}




