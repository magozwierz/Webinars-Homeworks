package homeworks.OOP_Homework;

public class Animal {
    public static String name;
    public static int age;
    public static boolean tail;
    public static String environment;

            public static String setName(String name) {
        return name;
    }

    public static boolean setTail(boolean b) {
        return b;
    }

    public static int setAge(int age) {
        return age;
    }
   public String setEnvironment(String environment) {
       return environment;
  }
    public Animal() {
        System.out.println("Animal was created");
    }
    public static void printName() {
        System.out.println("Imię zwierzaka to " + name);
    }
}

