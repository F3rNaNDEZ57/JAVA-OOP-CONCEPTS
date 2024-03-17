
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // using getters and setters
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(5);
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat age: " + cat.getAge() + "\n");

        // using constructor with two parameters
        Cat cat2 = new Cat("Jerry", 3);
        System.out.println("Cat name: " + cat2.getName());
        System.out.println("Cat age: " + cat2.getAge()+ "\n");

        // using constructor with no parameters
        Cat cat3 = new Cat();
        System.out.println("Cat name: " + cat3.getName());
        System.out.println("Cat age: " + cat3.getAge()+ "\n");
    }
}