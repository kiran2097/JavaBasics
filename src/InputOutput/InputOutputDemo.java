package InputOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class InputOutputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
//        input.useDelimiter(",");
        HashMap<String, Integer> freq = new HashMap<String, Integer>();
        Integer count;
//        ArrayList<String> Name = new ArrayList<>();
        int iter = 0;
        String name = input.nextLine();
        input.close();
        String[] Name = name.split(",");
        System.out.println(Arrays.toString(Name));
//        input.close();
        for (String nameInName: Name)
        {
            count = freq.get(nameInName);
            if(count == null)
            {
                count = 0;
            }
            count += 1;
            freq.put(nameInName, count);
        }
        for (String nameInName: freq.keySet()) {
            System.out.println("Frequency of " + nameInName + " is: " + freq.get(nameInName));
        }
//        input.close();
//        System.out.println(sentence);
    }
}
