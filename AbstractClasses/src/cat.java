public class cat extends animal{
    public cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
