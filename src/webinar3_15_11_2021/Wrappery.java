package webinar3_15_11_2021;

public class Wrappery {
    public static void main(String[] args) {
        Integer a = 1; //tak inicjalizujmey typy proste
        Integer b = new Integer(1);//tak inicjalizujemy klasy
        //a, b - obiekty
        // Integer - klasa

        Double c = 2.5;
        Float d = 3.2f;
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;

        System.out.println(a instanceof Object);// sprawdzanie co jest obiektem

        System.out.println(a.doubleValue());
        double nowaZmienna = a.doubleValue();
        System.out.println(e1.toString());
        System.out.println(d.intValue());



    }
}
