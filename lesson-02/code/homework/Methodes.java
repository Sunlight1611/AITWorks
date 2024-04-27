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
    }

