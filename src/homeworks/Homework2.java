package homeworks;

public class Homework2 {
    public static void main(String[] args) {
        wiekUztykownika(18); //wynik ćwiczenia 1
        System.out.println(SumaLiczb(2, 5, 7)); //wynik ćwiczenia 2
        System.out.println(Liczba(8));//wynik ćwiczenia 3
        objetosc(); //wynik ćwiczenia 4
        kolo(3);//wynik ćwiczenia 5
        System.out.println(szescian(2)); //wynik ćwiczenia 6.2.1
        System.out.println(pierwiastekDrugiego(4)); //wynik ćwiczenia 6.2.2
        }


    //Cwieczenie1
    public static void wiekUztykownika(int wiek) {

        System.out.println(wiek);
    }

    //Cwiczenie3
    public static int SumaLiczb(int l1, int l2, int l3) {

        return l1 + l2 + l3;
    }

    //Cwiczenie2
    public static double Liczba(double x) {

        return Math.pow(x, 2);
    }

    //Cwiczenie4 - wyliczanie objętości bryły
    public static double objetosc() {
        String bryla1 = "Ostrosłup";
        int podstDl1 = 2;
        int podstWys1 = 2;
        int wys1 = 6;
        double podstPole1 = 0.5 * podstDl1 * podstWys1;
        System.out.println(Math.round(podstPole1 * wys1 * 0.3));
        return Math.round(podstPole1 * wys1 * 0.3);
    }

    //Cwiczenie5
    public static void kolo(int r) {
        System.out.println("Pole koła to: " + Math.round(Math.PI * Math.pow(r, 2)));
        System.out.println("Obwód koła to: " + Math.round(2 * Math.PI * r));

    }

    //Cwiczenie6.2.1
    public static double szescian(double y) {
        return Math.pow(y,3);
    }
//Cwiczenie 6.2.2
public static double pierwiastekDrugiego(double c) {
        return Math.pow(c, 0.5);
}

}
