package String;
import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean alreadyExists = false;
            for (int j = 0; j < result.length(); j++) {
                if (current == result.charAt(j)) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                result = result + current;
            }
        }
        System.out.println("After removing duplicates = " + result);
    }
}