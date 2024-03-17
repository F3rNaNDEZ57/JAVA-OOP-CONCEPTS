//can't inherit from AnimalsInfo because it's a final class
public abstract class Animal {
    String name;
    int age;
    int weight;
    String color;

    private static int totalAnimals = 0;
    private static int totalCats = 0;
    private static int totalDogs = 0;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        if (totalAnimals <= AnimalsInfo.getTOTAL_ANIMALS()) {
            totalAnimals++;
        } else {
            System.out.println("You have reached the limit of animals\n");
        }
    }

    public static int getCurrentAnimals() {
        return totalAnimals;
    }

    public static int getCurrentCats() {
        return totalCats;
    }

    public static int getCurrentDogs() {
        return totalDogs;
    }

    public static void countCats() {
        if (totalCats <= AnimalsInfo.getTOTAL_CATS()) {
            totalCats++;
        } else {
            System.out.println("You have reached the limit of cats\n");
        }
    }

    public static void countDogs() {
        if (totalDogs <= AnimalsInfo.getTOTAL_DOGS()) {
            totalDogs++;
        } else {
            System.out.println("You have reached the limit of dogs\n");
        }
    }


}
