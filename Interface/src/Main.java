
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Rabbit", 2, "white", 2.0);
        Hawk hawk = new Hawk("Hawk", 3, "brown", 4.0);
        Fish fish = new Fish("Fish", 1, "gold", 0.5);

        rabbit.flee();//method from Prey interface
        hawk.hunt();//method from Predator interface
        fish.flee();//method from Prey interface
        fish.hunt();//method from Predator interface

        //interfaces are used to define common behavior for classes and
        //to group classes that share common behavior and
        //it allowed multiple inheritance in Java
    }
}