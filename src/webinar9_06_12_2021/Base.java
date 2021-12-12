package webinar9_06_12_2021;

public class Base {

    public String firstname = "Adam";

    Base() {
        System.out.println("Konstruktor Base Class");
    }

    Base(String x ) {
        System.out.println("Konstruktor Base Class " + x);
    }

    public void displayText() {
        System.out.println("Metoda z klady bazowej");
    }
}