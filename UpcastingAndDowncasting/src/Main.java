
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Upcasting
        Animal animal = new Dog();//this is upcasting because we are casting a subclass to a superclass
        animal.makeNoise();//this will print "Dog is barking" because we are calling the makeNoise method from the Dog class
        //animal.bark();//this will not work because the bark method is not in the Animal class
        makeAnimalNoises(animal);//this will print "Dog is barking" because we are calling the makeNoise method from the Dog class
        System.out.println("\n");

        Animal animal2 = new Cat();//this is upcasting because we are casting a subclass to a superclass
        animal2.makeNoise();//this will print "Cat is meowing" because we are calling the makeNoise method from the Cat class
        //animal2.meow();//this will not work because the meow method is not in the Animal class
        makeAnimalNoises(animal2);//this will print "Cat is meowing" because we are calling the makeNoise method from the Cat class
        System.out.println("\n");


        //Downcasting
        Dog dog = (Dog) animal;//this is downcasting because we are casting a superclass to a subclass
        dog.bark();//this will print "Woof!" because we are calling the bark method from the Dog class
        dog.makeNoise();//this will print "Dog is barking" because we are calling the makeNoise method from the Dog class
        makeAnimalNoises(dog);//this will print "Dog is barking" because we are calling the makeNoise method from the Dog class
        System.out.println("\n");

        Cat cat = (Cat) animal2;//this is downcasting because we are casting a superclass to a subclass
        cat.meow();//this will print "Meow!" because we are calling the meow method from the Cat class
        cat.makeNoise();//this will print "Cat is meowing" because we are calling the makeNoise method from the Cat class
        makeAnimalNoises(cat);//this will print "Cat is meowing" because we are calling the makeNoise method from the Cat class
        System.out.println("\n");

        //Downcasting with a superclass that is not a subclass of the superclass
        //Dog dog2 = (Dog) animal2;//this will throw a ClassCastException because we are casting a Cat object to a Dog object
        //dog2.bark();//this will not work because the bark method is not in the Animal class
        //dog2.makeNoise();//this will not work because the makeNoise method is not in the Animal class
        //makeAnimalNoises(dog2);//this will not work because the makeNoise method is not in the Animal class
        //System.out.println("\n");

    }

    public static void makeAnimalNoises(Animal animal) {
        animal.makeNoise();
    }
}