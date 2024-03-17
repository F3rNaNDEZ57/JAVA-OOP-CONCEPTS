public class Animal {
    String name;
    int age;

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("I'm an animal");
    }
}
