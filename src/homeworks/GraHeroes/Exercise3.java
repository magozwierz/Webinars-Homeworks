package homeworks.GraHeroes;

import java.util.Scanner;

//Napisz program wyznaczający najmniejszą z trzech liczb podanych przez użytkownika.
//        Wykorzystaj do tego instrukcje warunkowe if lub metodę Math.max()
public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Cwiczenie2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cwiczenie1.2:");
        System.out.println("Podaj pierwszą liczbę");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int number2 = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int number3 = scanner.nextInt();
       if (number1>=number2 && number2<=number3){
                        System.out.println("Najmniejsza z podanych liczb to " + number2);
           }else if (number1<=number2 && number1<=number3) {
           System.out.println("Najmniejsza z podanych liczb to " + number1);
                  }else if (number3<=number1 && number3<=number2){
           System.out.println("Najmniejsza z podanych liczb to " + number3);
        }
       }
    }


