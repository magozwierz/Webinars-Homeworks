package homeworks.GraHeroes;
//Utwórz nową klasę. Napisz w niej metodę, która będzie jako argument przyjmowała
//        tablicę. W metodzie wypisz wszystkie wartości z tablicy podniesione do kwadratu.
//        Wtej samej klasie utwórz metodę main.Wmetodzie main utwórz dowolną tablicę.
//        Wypełnij ją dowolnymi wartościami. Na tej tablicy przetestuj działanie metody
public class Exercise4 {
    public static void squaredTable (int table[]) {
        System.out.println("Wartości z tablicy podniesione do kwadratu: ");
        for (int element : table) {
                        System.out.println(Math.pow(element,2));
        }

    }
    public static void main(String[] args) {
        int table1[] = {3,6,9,6,12};
        squaredTable(table1);
    }






}
