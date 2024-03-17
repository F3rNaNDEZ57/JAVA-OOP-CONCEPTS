public abstract class animal {
    String name;
    int age;
    double weight;
    String color;

    public animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public abstract void makeSound();

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}
