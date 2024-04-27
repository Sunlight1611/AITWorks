package homework;
/* Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
 */
public class BankLoan {
    public static void main(String[] args) {
        int m = 0;
        int s = 0;
        int initialDebt = m; // Начальная сумма долга
        int targetDebt = s; // Целевая сумма долга
        double annualInterestRate = 0.10; // Годовая процентная ставка
        int years = 0; // Количество лет

        double debt = initialDebt; // Текущая сумма долга

        // Используем цикл while для увеличения суммы долга на 10% каждый год,

        while (debt <= targetDebt) {
            debt += debt * annualInterestRate; // Увеличиваем сумму долга на проценты
            years++; // Увеличиваем количество лет
        }

        System.out.println("Через " + years + " лет долг превысит 50000 тысяч рублей.");
    }
}




