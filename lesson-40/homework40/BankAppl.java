package homework40;

import java.util.HashSet;

public class BankAppl {

    public class CurrencyApp {
        public static void main(String[] args) {
            HashSet<String> currencySet = new HashSet<>();

            // Добавляем международные наименования валют
            currencySet.add("USD");
            currencySet.add("EUR");
            currencySet.add("GBP");
            currencySet.add("JPY");

            // Пытаемся добавить второй раз валюту USD (дубликат)
            if (!currencySet.add("USD")) {
                System.out.println("Валюта USD уже существует в системе.");
            }

            // Выводим все уникальные валюты
            System.out.println("Уникальные валюты в системе:");
            for (String currency : currencySet) {
                System.out.println(currency);
            }
        }
    }
}
