
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 5, "black");
        System.out.println(cat.name+" "+cat.age+" "+cat.color);
        cat.say();
    }
}