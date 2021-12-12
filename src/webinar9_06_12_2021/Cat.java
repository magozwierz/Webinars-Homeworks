package webinar9_06_12_2021;

public class Cat extends Animal {

    public Cat() {
        System.out.println("konstruktor klasy kot");
    }

    @Override
    public void useVoice() {
        System.out.println("Meow");
    }

    @Override
    public int getAge(int x) {
        return 0;
    }
}