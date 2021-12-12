package webinar9_06_12_2021;
public class SubClass extends Base {
    public String firstname = "Adnrzej";

    SubClass(String name) {
        super(name); // musi być jako pierwsza instrukcja w konstruktorze - jeśli super wywołuje konstruktor z klasy bazowej
        System.out.println("Konstruktor SubClass");
        super.displayText();
        message();
    }

    public void message() {
        System.out.println("Metoda z klasy pochodnej " + super.firstname);
        super.displayText();
        System.out.println(this);
        this.xxx();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void xxx() {

    }
}