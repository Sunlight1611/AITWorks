package classwork34.month;

public class MonthAppl {
    public static void main(String[] args) {

        Month month = Month.JUN;
        System.out.println(month);

        Month newMonth = month.plusMonth(2);
        System.out.println(newMonth);
        System.out.println("-------------------------------------");
        newMonth = month.plusMonth(15);
        System.out.println(newMonth);

    }
}
