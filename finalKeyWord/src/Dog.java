public class Dog extends Animal{
    public Dog(String name, int age, int weight, String color) {
        super(name, age, weight, color);
        Animal.countDogs();
    }

    public String toString() {
        return "Dog " + name + ", age " + age + ", weight " + weight + ", color " + color;
    }
}
