package homeworks.GraHeroes;

//Napisz program zwracający wartość bezwględną z liczby podanej przez użytkownika.
//Wykorzystaj do tego klasę Scanner używaną podczas pierwszych zajęć

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Cwiczenie1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        Double number = scanner.nextDouble();
        System.out.println("Wartość bezwzględna podanej liczby to " + absoluteValue(number));
    }
    public static double absoluteValue ( double number){
        if (number >= 0) {
            return number;
        } else return -number;
    }
}
