package classwork;

//Возведите 3 в степень 10,
// выведите на печать все промежуточные результаты.
public class Power3 {
    public static void main(String[] args) {
        int count = 1;
        int res = 1;

        while (count < 10) {
            res = 3 * res;
            System.out.println(res + " 3 in power " + count);
            count++;

        }
    }

}
