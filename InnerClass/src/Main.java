
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.outerField);
        outerClass.outerMethod();
        System.out.println("\n");

        OuterClass.InnerClass nonStaticInnerClass = outerClass.new InnerClass();
        //this is how to create an instance of an non static inner class because non static methods and stuffs only can be called by using an object
        System.out.println(nonStaticInnerClass.innerField);
        nonStaticInnerClass.innerMethod();
        System.out.println("\n");

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();//this is how to create an instance of an static inner class
        System.out.println(staticInnerClass.staticInnerField);
        staticInnerClass.staticInnerMethod();
        System.out.println("\n");

        outerClass.classInsideMethod();//this is how to call a class inside method
    }
}