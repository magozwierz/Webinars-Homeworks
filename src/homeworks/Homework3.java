package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Cwiczenie1.1:
        System.out.println("Cwiczenie1.1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę nie całkowitą");
        Double number = scanner.nextDouble();
        //System.out.println("Twoja liczba zaokrąglona w dół to: " + Math.floor(number));
        System.out.println("Twoja liczba zaokrąglona w dół to: " + number.intValue());

        //Cwiczenie 1.2:
        System.out.println("Cwiczenie1.2:");
        System.out.println("Podaj pierwszą liczbę");
        String number1 = scanner.next();
        System.out.println("Podaj drugą liczbę");
        String number2 = scanner.next();
        System.out.println(Integer.parseInt(number1)+Integer.parseInt(number2));

        //Cwiczenie2.1:
        System.out.println("Cwiczenie2.1:");
        String zmiennaTextowa = "abc def ghi";
        System.out.println(zmiennaTextowa.toUpperCase());

        //Cwiczenie2.2:
        System.out.println("Cwiczenie2.2:");
        System.out.println("Podaj jakiś teskt/wyraz");
        String text = scanner.next();
        System.out.println("Podaj jakąś literę");
        String letter = scanner.next();
        System.out.println(text.contains(letter));

        //Cwiczenie3.1:
        System.out.println("Cwiczenie3.1:");
        System.out.println("Reszta z dzielnia 7089760 przez 11 wynosi: " + 7089760%11);
        int zmienna1 = 18;
        int zmienna2 = 19;
        System.out.println(zmienna1==zmienna2);
        int zmienna3 = 18478475;
        System.out.println(zmienna3*5);

        //Cwiczenie3.2:
        System.out.println("Cwiczenie3.2:");
//        Rozpoczynasz tworzenie gry, w której celem jest przekomarzanie się z użytkowni-
//                kiem. Jeśli użytkownik wpisze wartość ”true” wyświetl mu wartość ”false”. Jeśli
//        wpisze ”false” wyświetl mu ”true”. W zadaniu wykorzystaj operator negacji
        System.out.println("Wybierz true lub false");
        boolean choice = scanner.nextBoolean();
        System.out.println(!choice);
    }

}
