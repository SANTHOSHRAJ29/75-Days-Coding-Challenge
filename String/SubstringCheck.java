package String;
import java.util.*;
public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter substring: ");
        String subString = sc.nextLine();
        boolean found = false;
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            int j;
            for (j = 0; j < subString.length(); j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subString.length()) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Substring found");
        }
        else {
            System.out.println("Substring not found");
        }
    }
}