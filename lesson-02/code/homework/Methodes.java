package homework;

public class Methodes {

    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        System.out.println("Method1 start");
        method2();
        System.out.println("Method1 finish");
    }
    public static void method2(){
        System.out.println("Method2 start");
        method3();
        System.out.println("Method2 finish");
    }

    public static void method3() {
        System.out.println("Method3 start");
        System.out.println("Method3 finish");

    }

    public static class Tale {
        public static void main(String[] args) {
            turnip();
        }

        private static void turnip() {
            System.out.println("Grandfather planted a turnip and the turnip grew sweet and big.");
            grandfather();
        }

        private static void grandfather() {
            System.out.println(
                    "Grandfather went to pluck a turnip: he pulls and pulls, he can't pull it out.Grandfather"
                            + "called grandmother.");
            grandmother();
        }

        private static void grandmother() {
            System.out.println(
                    "Grandmother for grandfather, Grandpa for the turnip."
                            + "They pull and pull, they can't pull it out.The grandmother called her granddaughter.");
            granddaughter();
        }

        private static void granddaughter() {
            System.out.println("They pull and pull, they can't pull it out. The granddaughter called Zhuchka.");
            dogZhuchka();
        }

        private static void dogZhuchka() {
            System.out.println("They pull and pull, they can't pull it out. Zhuchka called the cat.");
            cat();
        }

        private static void cat() {
            System.out.println("They pull and pull, they can't pull it out. The cat called the mouse.");
            mouse();
        }

        private static void mouse() {
            System.out.println("They pulled and pulled, and pulled out the turnip.");
            teamwork();
        }

        private static void teamwork() {
            System.out.println("Moral of the tale: Together we are strong !!!");
        }

    }
}

