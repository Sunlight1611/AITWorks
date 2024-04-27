package classwork19.string_ex;

import java.util.Scanner;

public class StringAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hallo";
        String str2 = "Hallo";

        System.out.println(str1==str2);
        String str3 = new String("Hallo");

        System.out.println(str1 ==str3);
        System.out.println(str1.equals(str3));

        System.out.println("Input string: ");
        String str4 = scanner.nextLine();
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));
    }
}
