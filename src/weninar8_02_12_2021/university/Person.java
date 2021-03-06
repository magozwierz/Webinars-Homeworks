package weninar8_02_12_2021.university;

public class Person {
    private String name;
    private int age;
    // final czyli nie mogę nadpisać wartości dla pola
    // static mogę odwołać się bez tworzenia obiektu klasy czyli Person.XXX
    public static final String XXX = "Wojtek";

    public Person() {
        System.out.println("Create Person");
    }

    public void introducte() {
        System.out.println("Introducte from person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}