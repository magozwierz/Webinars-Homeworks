package webinar7_29_11_2021;

public enum Country {
    PL("Poland", "Polska"),
    DE("Germany", "Niemcy"),
    UK("United Kingdom", "Wielka Brytania");

    private String englishName;
    private String polishName;

    //konstruktor
    Country(String englishName, String polishName) {
        this.englishName = englishName;
        this.polishName = polishName;

    }

    public String getEnglishName() {
        return englishName;
    }
public String getPolishName() {
        return polishName;

}
}
