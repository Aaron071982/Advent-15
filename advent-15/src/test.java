import java.util.ArrayList;
import java.util.List;


public class test {

    public static void main(String[] args) {
        // Example list of strings
        String[] items = {"rn=1","cm-","qp=3","cm=2"};
        int finalNumber = 0;
        // Iterate through each item in the list
        for (String current : items) {
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
}
