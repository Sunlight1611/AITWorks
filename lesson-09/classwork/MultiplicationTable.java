package classwork;
//распечатать таблицу умножения от 1 до 10
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 1;// first multiplayer
        int m = 1;//second multiplayer

        while (n<10){
            while(m<10){

                System.out.print(n + " * " + m + " = " + n * m + " | ");
                m++;
            }
            System.out.println();// nexi Line
            m = 1;// drop a to again
            n++;
        }
    }
}
