package wenbinar6_25_11_2021;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy jesteś pełnoletni");
        boolean isAdult = scanner.nextBoolean();
        if (isAdult==true){
            //kod do wyśiwtlenia gdy warunek jest spełniony
            System.out.println("Jestem pełnoletni");
        } else {
            //kod do wykonania jeśli warunek nie został spełniony
            System.out.println("Nie jestem pełnoletni");
        }
        System.out.println("Dalszy kod programu");

        checkNumIsDividedBy2And3(6);
    }

    public static void checkNumIsDividedBy2And3(int num) {
        if (num%2==0 && num%3==0) {
            System.out.println("LIczba podzielna przez 2 i 3");
            } else if (num%2==0) {
            System.out.println("Liczba podzeilna przez 2");
        } else if (num%3==0){
            System.out.println("Liczba podzielna przez 3");
        }
        else {
            System.out.println("Liczba nie jest podzielna przez 2 i3");
        }
    }
public static boolean isEvenNumber(int num) {
        if (num%2==0) {
            return true;
            }else {
            return false;
        }
}

public static boolean isEventNumberSimplyIFStatement(int num) {
        boolean even = num%2==0 ? true : false;
        return even;
}
public static boolean isEvenNumberSimplyWithoutIfStatement(int num) {
        return num%2==0;
    }

}
