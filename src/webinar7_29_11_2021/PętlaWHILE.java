package webinar7_29_11_2021;

public class PętlaWHILE {
    public static void main(String[] args) {
        int [] tab = {20,40,3,12,456};
        int i = 0;

        while(i<tab.length) {
            System.out.println(tab[i]);
            i++;
        }

        i=0;
        do {
            System.out.println(tab[i]);
            i++;
        } while(i<tab.length);
    }
}
