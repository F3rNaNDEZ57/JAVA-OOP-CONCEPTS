import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Mary", "Bob", "Jane", "Peter", "George", "Lucy", "Tom", "Alice", "Kate"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello World!");
            for(String name: names) {
                writer.write("\n"+name);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            System.out.println(reader.readLine());//read one line

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}