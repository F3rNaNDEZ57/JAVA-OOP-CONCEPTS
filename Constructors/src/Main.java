
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();// this is default constructor
        dog.bark();
        System.out.println("Name: " + dog.name + ", Age: " + dog.age + ", Color: " + dog.color + ", Weight: " + dog.weight);


        Cat cat = new Cat();// this is default constructor that we define in Cat.java
        System.out.println("Name: " + cat.name + ", Age: " + cat.age + ", Color: " + cat.color + ", Weight: " + cat.weight);

        Cat cat1 = new Cat("Kitty");// this is constructor with one parameter
        System.out.println("Name: " + cat1.name + ", Age: " + cat1.age + ", Color: " + cat1.color + ", Weight: " + cat1.weight);

        Cat cat2 = new Cat("Kitty", 2);// this is constructor with two parameters
        System.out.println("Name: " + cat2.name + ", Age: " + cat2.age + ", Color: " + cat2.color + ", Weight: " + cat2.weight);

        Cat cat3 = new Cat("Kitty", 2, "White");// this is constructor with three parameters
        System.out.println("Name: " + cat3.name + ", Age: " + cat3.age + ", Color: " + cat3.color + ", Weight: " + cat3.weight);

        Cat cat4 = new Cat("Kitty", 2, "White", 2.5);// this is constructor with four parameters
        System.out.println("Name: " + cat4.name + ", Age: " + cat4.age + ", Color: " + cat4.color + ", Weight: " + cat4.weight);

        cat.meow();
    }
}