package homeworks.GraHeroes;

import java.util.Random;
import java.util.Scanner;

//Kto pamięta bota snikersa? Bot snikers miał pewną zabawę - losował liczbę 1 do
//        100, a użytkownik, który z nim rozmawiał miał zgadywać jaka to liczba. Za każdym
//        razem dawał wskazówkę ”Moja liczba jest mniejsza” lub ”Moja liczba jest
//        większa”. Stwórz tę grę. Do losowania liczby wykorzystaj podany kod:
//        Random r = new Random(); int randomInt = r.nextInt(100) + 1;
public class Exercise5 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        for (int i = 0; i < randomInt; i++) {

            System.out.println("Zgaduj jaka to liczba?");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();


            if (number == randomInt) {
                System.out.println("Brawo, zgadłeś liczbę!!!");
            } else if (number < randomInt) {
                System.out.println("Moja liczba jest większa, zgaduj dalej!");
            } else if (number > randomInt) {
                System.out.println("Moja liczba jest mniejsza, zgaduj dalej");
            }

        }
    }
}

