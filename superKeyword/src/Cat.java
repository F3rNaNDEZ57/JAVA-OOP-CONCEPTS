public class Cat extends Animal{
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);//call constructor from parent class (Animal)
        this.color = color;
    }

    @Override
    public void say() {
        super.say();//print "I'm an animal" from parent class (Animal)
        System.out.println("I'm a cat");
    }
}
