public class Cat extends Animal{
    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
        Animal.countCats();
    }

    public String toString() {
        return "Cat " + name + ", age " + age + ", weight " + weight + ", color " + color;
    }


}
