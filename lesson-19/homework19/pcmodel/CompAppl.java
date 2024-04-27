package homework19.pcmodel;

public class CompAppl extends Computer{
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];

        computers[0] = new Computer("HP", 1950,181-665-111-000);
        computers[1] = new Computer("Toshiba", 1250, 454-522-338-512);
        computers[2] = new Computer("Apple", 3200,568-912-355-947);

        ComputerShop computerShop = new ComputerShop(computers, "Saturn Techno");

        System.out.println(computerShop);
        computerShop.showAllComputers();
        Computer boughtComputer = computerShop.buy(4000, "121-234-562-123");
        System.out.println("Bought computer: " + boughtComputer);
    }
}











