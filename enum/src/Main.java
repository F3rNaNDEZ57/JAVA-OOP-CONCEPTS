
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //DaysOfTheWeek today = new DaysOfTheWeek();//this gives an error because enums cannot be instantiated

        DaysOfTheWeek today = DaysOfTheWeek.MONDAY;//this is the correct way to use enums
        System.out.println("Today is " + today);

        if (today == DaysOfTheWeek.MONDAY) { //enums can be use in any kind of comparison and operations
            System.out.println("Mondays are bad.");
        } else if (today == DaysOfTheWeek.FRIDAY) {
            System.out.println("Fridays are better.");
        } else if (today == DaysOfTheWeek.SATURDAY || today == DaysOfTheWeek.SUNDAY) {
            System.out.println("Weekends are best.");
        } else {
            System.out.println("Midweek days are so-so.");
        }

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {//enums can be use in any kind of loop
            System.out.println(day);
        }


        FastFood order1 = FastFood.BURRITO;
        FastFood order2 = FastFood.PIZZA;
        FastFood order3 = FastFood.BURRITO;

        System.out.println("order1 is " + order1 +" and have "+order1.calories+" calories"); //enums with constructor
        System.out.println("order2 is " + order2 +" and have "+order2.calories+" calories");
        System.out.println("order3 is " + order3 +" and have "+order3.calories+" calories");
    }
}