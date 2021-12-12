package homeworks.OOP_Homework;

public class MyProgram {
    public static void main(String[] args) {

        //Cwiczenie 1.1:
        System.out.println("Cwiczenie1.1:");
        Animal bird = new Animal();
        Animal fish = new Animal();

        bird.name = "Wróbelek";
        bird.tail = false;
        bird.age = 2;
        bird.environment = "Air";

        fish.setEnvironment("Water");
        fish.setTail(false);
        fish.setAge(1);
        fish.setName("Nemo");

//Cwiczenie 1.2:
        System.out.println("Cwiczenie1.2:");
        WaterAnimal shark = new WaterAnimal();
        shark.setName("Ludojad");

        //Cwiczenie 1.3:
        System.out.println("Cwiczennie1.3:");
Animal dog = new Animal();
Zebra zebra = new Zebra();

//Cwiczenie1.4:
        System.out.println("Cwiczenie1.4:");
Zebra zebra1 = new Zebra();
zebra1.name = "Czarnulka";
zebra1.printName();
    }


}

