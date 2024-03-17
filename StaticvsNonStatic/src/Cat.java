public class Cat {
    String name;
    String color;
    int age;
    double weight;
    int remainingLives;

    static String type = "cat";
    private static int catCount = 0;

    public Cat(String name,String color,int age,double weight,int remainingLives){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.remainingLives = remainingLives;
        catCount++;
    }

    public void meow(){
        System.out.println("meow!!!");
    }

//    public static void printinfo(){
//        System.out.println("Name :"+ name);
//        System.out.println("Color :"+ color);
//        System.out.println("Age :"+ age);
//        System.out.println("Weight :"+ weight);
//        System.out.println("Remaining Lives :" + remainingLives);
//    }

    public void printInfo(){
        System.out.println("Cat No :"+ catCount);
        System.out.println("Name :"+ name);
        System.out.println("Color :"+ color);
        System.out.println("Age :"+ age);
        System.out.println("Weight :"+ weight);
        System.out.println("Remaining Lives :" + remainingLives);
    }


    public static void printType(){
        System.out.println("Type :"+ type);
    }

    public static int getCatCount(){
        return catCount;
    }
}
