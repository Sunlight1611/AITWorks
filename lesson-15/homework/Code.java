package homework;

public class Code {
    // Метод для вычисления длины штрих-кода
    public int lengthCode(long code) {
        return String.valueOf(code).length();
    }

    // Метод для вычисления контрольной суммы штрих-кода
    public int controlSum(long code) {
        String codeStr = String.valueOf(code);
        int sum = 0;

        for (int i = 0; i < codeStr.length(); i++) {
            sum += Character.getNumericValue(codeStr.charAt(i));
        }

        return sum;
    }

    // Метод для проверки правильности длины штрих-кода
    public boolean isValid(long code) {
        int length = lengthCode(code);

        // Проверяем, соответствует ли длина штрих-кода стандарту (обычно 8 или 13 цифр)
        return length == 8 || length == 13;
    }

    public static void main(String[] args) {
        Code codeChecker = new Code();

        long code1 = 45826312;
        long code2 = 5689231458765L;


        System.out.println("Length of code1: " + codeChecker.lengthCode(code1));
        System.out.println("Control sum of code1: " + codeChecker.controlSum(code1));
        System.out.println("Is code1 valid: " + codeChecker.isValid(code1));
        System.out.println();

        System.out.println("Length of code2: " + codeChecker.lengthCode(code2));
        System.out.println("Control sum of code2: " + codeChecker.controlSum(code2));
        System.out.println("Is code2 valid: " + codeChecker.isValid(code2));
        System.out.println();


    }
}

