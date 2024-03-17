
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("TotalAnimals: " + AnimalsInfo.getTOTAL_ANIMALS() + " TotalCats: " + AnimalsInfo.getTOTAL_CATS() + " TotalDogs: " + AnimalsInfo.getTOTAL_DOGS());

        Dog dog1 = new Dog("Rex", 5, 10, "black");
        System.out.println(dog1.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());


        Cat cat1 = new Cat("Tom", 3, 5, "white");
        System.out.println(cat1.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());


//        AnimalsInfo.TOTAL_ANIMALS = 10;// this line will not compile because TOTAL_ANIMALS is final

        Dog dog2 = new Dog("Rex", 5, 10, "black");
        System.out.println(dog2.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());


        Cat cat2 = new Cat("Tom", 3, 5, "white");
        System.out.println(cat2.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());


        Dog dog3 = new Dog("Rex", 5, 10, "black");
        System.out.println(dog3.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());


        Cat cat3 = new Cat("Tom", 3, 5, "white");
        System.out.println(cat3.toString());
        System.out.println("CurrentAnimals: " + Animal.getCurrentAnimals() + " CurrentCats: " + Animal.getCurrentCats() + " CurrentDogs: " + Animal.getCurrentDogs());

    }
}