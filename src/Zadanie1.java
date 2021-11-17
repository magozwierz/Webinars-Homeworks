import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile masz lat?");
        int wiek = scanner.nextInt();
        int a = ++wiek;
        System.out.println("Za rok będziesz miał " + a + " lat");
}
}
