package classwork;

import java.util.Scanner;

//Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:
//- упаковки в желтый бак
//- пищевые отходы в коричневый бак
//- бумага в зеленый бак
//- прочие отходы в черный бак
public class Garbage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input title or sort og garbage: ");
        String garbage = scanner.nextLine();

        switch (garbage){
            case "paper" -> System.out.println("Put it in green box.");
            case "plastic" -> System.out.println("Put it in yellow box.");
            case "food", "bio" -> System.out.println("Put it in brown box.");
            case "other","rest","metal" -> System.out.println("Put it in black box.");
            default -> System.out.println("Pls,use paper,plastic,food,bio,other,rest of metal. Save the planet! ");

        }



    }
}
