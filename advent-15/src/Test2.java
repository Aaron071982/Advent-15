import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        File f = null;
        try {
            f = new File("src/input");
            Scanner s = new Scanner(f);
            String input = s.toString();
            String[] items = input.split(",");
            //goes through item in the list
            for (String item: items){
                for(char character: item.toCharArray()){
                    //System.out.println((int)currentValue + "");
                }
            }
            //System.out.println(finalValue);

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}