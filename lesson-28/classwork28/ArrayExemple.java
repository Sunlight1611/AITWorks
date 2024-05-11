package classwork28;

public class ArrayExemple {
    public static void main(String[] args) {
        int[] myArray = new int [4];

        myArray[0] = 3;
        myArray[1] = 4;
        myArray[2] = 1;
        myArray[3] = 9;


        for (int i: myArray) {
            System.out.println(i);
        }
    }
}
