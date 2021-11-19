package homeworks;

import java.util.Scanner;

public class Homework4 {

    //String3

        // oprócz operatora '+', do łączenia wielu zmiennych typu String można wykorzystać metodę:
        // String.join(delimiter, String1, String2, String3...);
        // do której jako pierwszy argument wpisujemy znak którym będą oddzielone wszystkie Stringi
        // wpisane jako kolejne argumenty funkcji

        //1. Spróbuj za pomocą funkcji join klasy String połączyć dane pracownika z zadania String2
        //2. Spróbuj za pomocą funkcji join klasy String połączyć myślnikami numer telefonu użytkownika

        public static void main(String[] args) {
            String name = "Jan";
            String secondName = "Józef";
            String surname = "Nowak";

            String numbers1 = "111";
            String numbers2 = "222";
            String numbers3 = "333";
            System.out.println("Cwiczenie 1.1:");
            System.out.println(String.join(" ", name, secondName, surname));
            System.out.println("\nCwiczenie 1.2:");
            System.out.println(String.join("-", numbers1, numbers2, numbers3));

            // String4
            //1. Z wykorzystaniem metody substring klasy String wyłącz wiek użytkownika ze zmiennej text
            //2. Z wykorzystaniem klasy Integer zamień wiek użytkownika na liczbę
            String text = "Mam 35 lat";
            System.out.println("\nCwiczenie 2.1:");
            System.out.println("Wiek użytkownika to: " + text.substring(4, 6));
            System.out.println("\nCwiczenie 2.2:");
            Integer.parseInt(text.substring(4, 6));


            System.out.println("\nĆwiczenie3:");
            String contact = "Kontakt : 111−222−333";
            String phoneNumber = contact.substring(10);
            System.out.println("Zmienna phoneNumber pobrana z contact: " + phoneNumber);

            System.out.println("\nCwiczenie4:");
            Scanner word1User = new Scanner(System.in);
            System.out.println("Wprowadź pierwszy wyraz");
            String a = word1User.next();
            Scanner word2User = new Scanner(System.in);
            System.out.println("Wprowadź drugi wyraz");
            String b = word2User.next();
            System.out.println(longer(a, b));
            System.out.println(longer("samochód","lodówka"));
        }
            public static int longer(String word1, String word2){
                int x = word1.length()>word2.length()?  1 : 2;
                return x;

        }
    }

