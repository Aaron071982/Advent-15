import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/input";

        // Read the items from the file and create an array
        String[] itemsArray = readItemsFromFile(filePath);

        // Print the items in the array
        System.out.println("Items in the array: " + Arrays.toString(itemsArray));

        // Example list of strings
        int finalNumber = 0;
        // Iterate through each item in the list
        for (String current : itemsArray) {
            System.out.println();
            System.out.println(current);
            int currentNumber = 0;
            for (int j = 0; j < current.length(); j++) {
                int number = current.charAt(j);
                currentNumber+=number;
                currentNumber*=17;
                currentNumber%=256;
                System.out.println(number);
            }
            finalNumber += currentNumber;
            System.out.println(currentNumber);
        }
        System.out.println(finalNumber);

    }

    private static String[] readItemsFromFile(String filePath) {
        List<String> itemList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                itemList.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Convert the List<String> to String[]
        return itemList.toArray(new String[0]);
    }
}