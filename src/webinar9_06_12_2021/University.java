package webinar9_06_12_2021;

// klasa final - nie można po niej dziedziczyć
public final class University {
    public static final float PI = 3.14f; // stała - słowo final = nie mogę zmienić wartości
    public String name;
    protected String course;
    private String grade;
    String city;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // metoda final - nie mogę jej przeciążyć
    public final void courses() {

    }
}