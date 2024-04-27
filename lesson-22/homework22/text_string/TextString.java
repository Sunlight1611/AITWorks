package homework22.text_string;

public class TextString {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        // последний символ строки
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // позицию подстроки "Java" в строке
        int javaIndex = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaIndex);

        // содержит ли заданная строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка подстроку 'Java': " + containsJava);

        // Замена все символов 'o' на 'a'
        String replacedStr = str.replace('o', 'a');
        System.out.println("Строка после замены 'o' на 'a': " + replacedStr);

        // Преобразование строки к верхнему регистру
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseStr);

        // Преобразование строки к нижнему регистру
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseStr);

        // Вырезать подстроку Java с помощью метода substring()
        String subStr = str.substring(javaIndex, javaIndex + 4); // 4 - длина подстроки "Java"
        System.out.println("Подстрока 'Java': " + subStr);

        // Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка на '!!!': " + endsWithExclamation);

        // Проверить, начинается ли строка подстрокой "I'm proud"
        boolean startsWithImProud = str.startsWith("I'm proud");
        System.out.println("Начинается ли строка с 'I'm proud': " + startsWithImProud);
    }
}


