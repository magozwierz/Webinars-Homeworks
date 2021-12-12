package webinar7_29_11_2021;

public class PętlaFOR {
    public static void main(String[] args) {

        int [] tab = {20,40,3,12,456};
        for ( int i =0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

        for (int element : tab) {
            System.out.println(element);
        }


        for (int i = 0; i<10; i++) { //i jest widoczna tylko w tej pętli
            System.out.println("Liczba: " + i);
        }
    }

}
