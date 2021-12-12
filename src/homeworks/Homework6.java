package homeworks;

import java.util.Arrays;

import static java.util.Arrays.parallelPrefix;

public class Homework6 {
    /*Napisz metodę odwracającą string (zwracającą string napisany wspak). Czyli np dla TESTUJ ma zwrócić JUTSET
------------
2.
Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie: a. wypełnij je wartościami z przedziału -10 - 10
b. wypisz na ekranie zawartość tablicy
c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
e. wypisz ilość elementów większych/mniejszych od średniej
f. wypisz tablicę w odwrotnej kolejności
Przykład:
liczby:
-3 9 2 -10 -3 -4 -1 -5 -10 8
Min: -10, max: 9
Średnia: -1,00
Mniejszych od śr.: 6
Większych od śr.: 3
Liczby w odwrotnej kolejności:
8 -10 -5 -1 -4 -3 -10 2 9 -3
7:51
------------
3.
Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10 a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
Przykład:
liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
Wystąpienia:
1 - 1
2 - 1
3 - 3
4 - 3
5 - 3
6 - 4
7 - 1
8 - 2
9 - 0
10 - 2 */

    public static void main(String[] args) {
        //Cwiczenie1
        System.out.println("Rozwiązanie Cwiczenia1:");
        String word = "TESTUJ";
        char[] wordArray = word.toCharArray();
        //        Character first = wordArray[5];
//        Character second = wordArray[4];
//        Character third = wordArray[3];
//        Character fourth = wordArray[2];
//        Character fifth = wordArray[1];
//        Character sixth = wordArray[0];
//        String a = first.toString();
//        String b = second.toString();
//        String c = third.toString();
//        String d = fourth.toString();
//        String e = fifth.toString();
//        String f = sixth.toString();
//        System.out.println(a + b + c + d + e + f);

        int odwrotne1[] = new int[wordArray.length];
        int n = wordArray.length - 1;
        int j = n;
        for (int i = 0; i <= n; i++) {
            odwrotne1[i] = wordArray[j];
            j--;
            for (int element : odwrotne1) {
                System.out.println(element);

            }
        }

// Cwiczenie2:
        System.out.println("Rozwiązanie Cwiczenia2");
        int[] myArray = new int[]{-6, -9, -3, 0, -1, 2, 4, 7, 9, 10};
        System.out.println(Arrays.toString(myArray));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (myArray[i] <= min) {
                min = myArray[i];
            }
            if (myArray[i] >= max) {
                max = myArray[i];
            }
        }
        System.out.println("Wartość maksymalna w tablicy to: " + max);
        System.out.println("Wartość minimalna w tablicy to: " + min);

        int suma = 0;
        for (int x = 0; x < myArray.length; x++) {
            suma = suma + myArray[x];
        }
        int g = suma / myArray.length;
        System.out.println("Suma elementów tablicy: " + suma);
        System.out.println("Średnia arytmetyczna elementów tablicy to: " + g);

        int mniejszych = 0;
        int wiekszych = 0;
        for (int y = 0; y < myArray.length; y++) {
            if (myArray[y] < g) {
                mniejszych++;
            } else if (myArray[y] > g) {
                wiekszych++;
            }
        }
        System.out.println("Elementów mniejszych od średniej arytmetycznej jest: " + mniejszych);
        System.out.println("Elementów większych od średniej arytmetycznej jest: " + wiekszych);

        int odwrotne[] = new int[myArray.length];
        int w = myArray.length - 1;
        int s = w;
        for (int i = 0; i <= w; i++) {
            odwrotne[i] = myArray[s];
            s--;
        }
        System.out.println(Arrays.toString(odwrotne));

        //Cwiczenie3:
        System.out.println("Cwiczenie3:");
        int[] arrayEx3 = new int[]{6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        int[] arrayAdditional = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        do {
            count++;
        }while (arrayEx3[0] == arrayAdditional[1]);

        }
    }




//    String magdalena = "Magdalena";
//    int count = 0;
//        for(int i = 0; i<magdalena.length(); i++)
//    {
//        if(magdalena.charAt(i)=='a')
//            count++;
//    }
//        System.out.println(count);
//}


//        //Wypisz wynik
//        if (suma == 1) {
//            System.out.println("element " + arrayEx3[i] + "występuje " + suma + " raz");
//        } else {
//            System.out.println("element " + arrayEx3[i] + "występuje " + suma + " razy");
//        }






