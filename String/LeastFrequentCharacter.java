package String;
import java.util.*;
public class LeastFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char leastFrequent = str.charAt(0);
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    count++;
                }
            }
            if (count < minCount) {
                minCount = count;
                leastFrequent = current;
            }
        }
        System.out.println("Least frequent character = " + leastFrequent);
        System.out.println("Frequency = " + minCount);
    }
}