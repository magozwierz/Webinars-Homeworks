package homeworks;

public class Homework2 {
    public static void main(String[] args) {
        userAge(18); //wynik ćwiczenia 1
        System.out.println(sumOfThree(2, 5, 7)); //wynik ćwiczenia 2
        System.out.println(powerOfTwo(8));//wynik ćwiczenia 3
        figureVolume(); //wynik ćwiczenia 4
        circleParameters(3);//wynik ćwiczenia 5
        System.out.println(powerOfThree(2)); //wynik ćwiczenia 6.2.1
        System.out.println(secondRoot(4)); //wynik ćwiczenia 6.2.2
        }


    //Cwieczenie1
    public static void userAge(int wiek) {

        System.out.println(wiek);
    }

    //Cwiczenie3
    public static int sumOfThree(int l1, int l2, int l3) {

        return l1 + l2 + l3;
    }

    //Cwiczenie2
    public static double powerOfTwo(double x) {

        return Math.pow(x, 2);
    }

    //Cwiczenie4 - wyliczanie objętości bryły
    public static double figureVolume() {
        String bryla1 = "Ostrosłup";
        int podstDl1 = 2;
        int podstWys1 = 2;
        int wys1 = 6;
        double podstPole1 = 0.5 * podstDl1 * podstWys1;
        System.out.println("Liczę objętośc dla " + bryla1);
        System.out.println(Math.round(podstPole1 * wys1 * 0.3));
        return Math.round(podstPole1 * wys1 * 0.3);
    }

    //Cwiczenie5
    public static void circleParameters(int r) {
        System.out.println("Pole koła to: " + Math.round(Math.PI * Math.pow(r, 2)));
        System.out.println("Obwód koła to: " + Math.round(2 * Math.PI * r));

    }

    //Cwiczenie6.2.1
    public static double powerOfThree(double y) {
        return Math.pow(y,3);
    }
//Cwiczenie 6.2.2
public static double secondRoot(double c) {
        return Math.pow(c, 0.5);
}

}
