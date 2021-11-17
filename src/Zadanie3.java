public class Zadanie3 {
    static String hello = "hello"; //zmienna globalna

    public static void main(String[] args) {
        printHello();
        printName("Magda");

    }
    public static void printHello() {
        System.out.println("Hello");
    }

    //zrobienie uniwersalnej metody
    public static void printName(String name){
        System.out.println("Hello " +name);
    }

    String surname = "Kowalski";
}
