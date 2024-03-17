public class Fish extends Animal implements Prey, Predator{

        public Fish(String name, int age, String color, double weight) {
            super(name, age, color, weight);
            System.out.println("A fish has been created.");
        }

        @Override
        public void flee() {
            System.out.println("The fish flees.");
        }

        @Override
        public void hunt() {
            System.out.println("The fish hunts.");
        }
}
