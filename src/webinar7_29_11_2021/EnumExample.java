package webinar7_29_11_2021;

public class EnumExample {
    public static void main(String[] args) {
       Priorytety lowPriority = Priorytety.LOW;
        System.out.println(lowPriority);

        //wyświetlenie numeru porządkowego z enuma
        System.out.println(lowPriority.ordinal());

        // konwersja (zamiana) string na enum
        Priorytety midPriority = Priorytety.valueOf("MID");

        //konwersja enum na string
        String priority = Priorytety.HIGH.name();


        // zczytanie wszystkich wartości enuma jako tablica
        Priorytety [] priorities = Priorytety.values();

        Country country = Country.PL;
        System.out.println(country.getEnglishName());
        System.out.println(country.getPolishName());
    }
}
