public class Cat extends Animal{


    public Cat(){ // this is default constructor

    }
    //in this case(where we already define a constructor), if we doesn't define default constructor we can't use it
    //if we want to use it we have to define it
    //if we define a constructor with parameters, we can't use default constructor

    public Cat(String name){ // this is constructor with one parameter
        this.name = name;
    }

    public Cat(String name, int age){ // this is constructor with two parameters
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color){ // this is constructor with three parameters
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Cat(String name, int age, String color, double weight){ // this is constructor with four parameters
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
