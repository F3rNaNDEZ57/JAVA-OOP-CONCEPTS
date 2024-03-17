public class Hawk extends Animal implements Predator{

        public Hawk(String name, int age, String color, double weight) {
            super(name, age, color, weight);
            System.out.println("A hawk has been created.");
        }

        @Override
        public void hunt() {
            System.out.println("The hawk hunts.");
        }
}
