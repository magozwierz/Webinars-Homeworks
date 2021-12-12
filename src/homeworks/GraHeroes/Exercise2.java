package homeworks.GraHeroes;

import java.util.Scanner;

//Napisz program informujący czy liczba podana przez użytkownika jest parzysta
//        czy nieparzysta.Wykorzystaj do tego operator modulo %
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Cwiczenie2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        Double number = scanner.nextDouble();
        if (number % 2 == 0) {
           System.out.println("Podana liczba jest parzysta");
        } else {
            System.out.println("Podana liczba jest nieparzysta");
        }
    }
}


