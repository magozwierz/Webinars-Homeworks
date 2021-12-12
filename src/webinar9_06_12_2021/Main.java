package webinar9_06_12_2021;

public class Main {

    public static void main(String[] args) {
        SubClass subClass = new SubClass("Wojtek");

        subClass.message();
//        System.out.println(University.PI);
//
//        Dog pies = new Dog();
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());
//
//        Dog pies2 = new Dog();
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());

//        Petable petable = new Dog();
//        petable.pet();
//        petable.printMsg();
//
//
//        // klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji
////	    Animal animal = new Animal();
//
//        University university = new University();
//        university.name = "Politechnika";
//
//        HighSchool highSchool = new HighSchool();
//        highSchool.name = "";
//
//        Dog dog = new Dog();
//        dog.testDog();
//        Cat cat = new Cat();
//
//        Animal animalDog = new Dog();
//        Animal animalCat = new Cat();
//
//        animalDog.useVoice();
//        animalCat.useVoice();
//
//        Dog[] dogs = new Dog[2];
//        Cat[] cats = new Cat[2];
//
//        Animal[] animals = new Animal[5];
//        animals[0] = dog;
//        animals[1] = animalDog;
//        animals[2] = cat;
//        animals[3] = animalCat;
//        animals[4] = new Elephant();
//
//        for (int i = 0; i < animals.length; i++) {
//            voice(animals[i]);
//        }
    }

    public static void voice(Animal animal) {
        animal.useVoice();
    }

//    public static void voiceDog(Dog dog) {
//        dog.useVoice();
//    }
//
//    public static void voiceCat(Cat cat) {
//        cat.useVoice();
//    }
}