public class Rabbit extends Animal implements Prey{

    public Rabbit(String name, int age, String color, double weight) {
        super(name, age, color, weight);
        System.out.println("A rabbit has been created.");
    }

    @Override
    public void flee() {
        System.out.println("The rabbit flees.");
    }
}
