package homework;
//В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от
// предыдущего значения.
// Определите номер того дня, на который пробег спортсмена
// составит не менее target километров. Программа получает на
// вход действительные числа s и target и должна вывести одно натуральное число.
public class makeSprinterRunUntil {
        public static void main(String[] args) {
            int result = makeSprinterRunUntil(232, 11212432);
            System.out.println(result);
        }
        public static int makeSprinterRunUntil(double s, double target) {
            if (s <= 0) {
                System.out.println("Invalid s value");
                System.exit(-1);
            }

            if (target <= 0) {
                System.out.println("Invalid target value");
                System.exit(-1);
            }

            int dayCounter = 1;

            while (s < target) {
                s = s + s * 0.1;
                dayCounter++;
            }

            return dayCounter;
        }
    }

