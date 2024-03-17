
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int myInt = Integer.parseInt("abc");
        //System.out.println(myInt);
        //this will throw an exception NumberFormatException

        //try catch block
        try{
            int myInt = Integer.parseInt("abc");
            System.out.println(myInt);//this is not gonna execute because above statement will throw an exception
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception,u can't do that");//this block gonna catch it and execute
            System.out.println(e);//this will print the error message
        }
        finally {
            System.out.println("this will always execute");
            //System.out.println(myInt);//this will throw an error because myInt is not defined in this scope
        }


        System.out.println("\n\n");

        //Custom Exception
        checkAge(1);//this will not throw an exception
        checkAge(-10);//this will throw an exception

    }

    public static void checkAge(int age){
        if(age < 0){
            try {
//                throw new AgeLessThanZeroExeption();//this will throw an exception without any message
                throw new AgeLessThanZeroExeption("Age is "+age+" and Age can't be less than zero");//this will throw an exception with a message
            } catch (AgeLessThanZeroExeption e) {
                System.out.println(e);
            }
        }
        else{
            System.out.println("Age is " + age + " and it is valid");
        }
    }
}