package webinar7_29_11_2021;

public class Continue {
    public static void main(String[] args) {
        //chcemy wyświetlić liczby parzyste z zakresu <x; y>, ale nie chcę wyświetlać liczb podzielnych przez 4
        int x = 10;
        int y = 30;
        for (int i = x; i<=y; i++) {
            if (i%4==0) {
                //przerywamy aktualną iterację
                continue;
            }

            if (i %2==0) {
                System.out.println(i);

//                if (i %2==0 && i %4 !=0) {
//                    System.out.println(i);

                if (i%19==0) {
                    break;
                }
            }
        }
    }
}
