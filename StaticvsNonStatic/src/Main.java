//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Cat Count: " + Cat.getCatCount());//this print the number of cats
        Cat mycat = new Cat("miki","black",2,11.5,9);

        mycat.meow();//print meow!!!

/*      Cat.meow()  this print error because meow() is a non static method
        and non static methods only can be used in individual objects
*/
//        Cat.printinfo();// this also gives error because all of the variables are non static
//        and non static variables only can be used in individual objects

        mycat.printInfo();//this print all the information of the cat

        Cat.printType();//this print the type of the cat
        //this dosen't gives an error because type is a static variable

        System.out.println(mycat.type);//this also print the type of the cat
        //this dosen't gives an error because type is a static variable

        mycat.type = "dog";//this change the type of the cat to dog
        System.out.println(mycat.type);//this print the type of the cat
        //this dosen't gives an error because type is a static variable
        //so objects can change the value of static variables

        Cat.printType();//this print the type of the cat
        System.out.printf("Cat Count: " + Cat.getCatCount());//this print the number of cats

        Cat mycat2 = new Cat("ikim","black",2,11.5,9);
        System.out.println("Cat Count: " + Cat.getCatCount());//this print the number of cats
        mycat2.printInfo();
    }
}