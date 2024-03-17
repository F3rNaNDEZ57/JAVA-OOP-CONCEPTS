import java.util.ArrayList;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Arrays

        //Create an array without giving elements at the declaration
        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Mary";
        names[2] = "Bob";
        names[3] = "Jane";
        names[4] = "Peter";


        System.out.println(names);//prints the memory address of the array
        System.out.println("\n");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\n");

        //names[5] = "George";//ArrayIndexOutOfBoundsException because the array has only 5 elements and it can't be change after declaration

        //Create an array with elements at the declaration
        String[] names2 = {"John", "Mary", "Bob", "Jane", "Peter"};
        for (String name : names2) {
            System.out.println(name);
        }
        System.out.println("\n");

        int[][] numbers = new int[2][3];//2 rows, 3 columns kind a like a matrix
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;

        for (int[] number : numbers) {
            for (int j = 0; j < numbers[0].length; j++) {//numbers[0].length because all rows have the same length
                System.out.print(number[j] + " ");
            }
            System.out.println();
        }

        System.out.println("length of a 2D array : " +numbers.length);


        //ArrayLists

        //Create an ArrayList without giving elements at the declaration
        ArrayList<String> names3 = new ArrayList<String>();

        names3.add("John");
        names3.add("Mary");
        names3.add("Bob");
        names3.add("Jane");
        names3.add("Peter");
        //can add many names as you want

        System.out.println(names3);

        //


        //to get the size of the Array and ArrayList
        System.out.println(names.length);
        System.out.println(names3.size());

        //to get the element at a specific index
        System.out.println(names[0]);
        System.out.println(names3.get(0));

        //to change the element at a specific index
        names[0] = "George";
        names3.set(0, "George");
        System.out.println(names[0]);
        System.out.println(names3.get(0));

        //to remove an element at a specific index
        names3.remove(0);
        System.out.println(names3);
        //we cant do remove on an Array because it has a fixed size

        //to add element to end of the Array and ArrayList
        //we cant do add on an Array because it has a fixed size
        names3.add("George");
        System.out.println(names3);

        //to add element at a specific index
        names3.add(0, "George");
        System.out.println(names3);
        names[0] = "George1";
        System.out.println(names[0]);

        //to check if an element exists in the Array and ArrayList
        System.out.println(Arrays.asList(names).contains("George1"));//we need to convert the Array to a List first
        System.out.println(names3.contains("George1"));//we dont need to convert the ArrayList to a List first

        //to get the index of an element
        System.out.println(Arrays.asList(names).indexOf("George1"));//we need to convert the Array to a List first
        System.out.println(names3.indexOf("George1"));//we dont need to convert the ArrayList to a List first

        //to check if the Array and ArrayList are empty
        System.out.println(names.length == 0);
        System.out.println(names3.isEmpty());

        //to remove all elements from the Array and ArrayList
        names3.clear();
        System.out.println(names3);
        //we cant do clear on an Array because it has a fixed size

        //to convert an Array to an ArrayList
        ArrayList<String> names4 = new ArrayList<String>(Arrays.asList(names));
        System.out.println(names4);

        //to convert an ArrayList to an Array
        String[] names5 = names3.toArray(new String[names3.size()]);
        System.out.println(Arrays.toString(names5));

        //to convert an ArrayList to a String
        String names6 = String.join(", ", names3);
        System.out.println(names6);

    }
}