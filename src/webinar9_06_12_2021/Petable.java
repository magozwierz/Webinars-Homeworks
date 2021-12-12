package webinar9_06_12_2021;

public interface Petable {
    void pet();

    default void printMsg() {
        System.out.println("Domyślna implementacja");
    }
}