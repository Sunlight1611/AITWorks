package homework25;

public class Calculator25 {
    public static void main(String[] args) {
        int targetNumber = 9 * 1948;
        int result = sumUpTO(targetNumber);
        System.out.println("sumUpTO(" + targetNumber + ") = " + result);
    }
    public static int sumUpTO(int targetNumber){
        int result = 0;
        for (int i = 0; i < targetNumber; i++) {
            result += i;
        }
        return result;
    }
}
