package String;
import java.util.*;
public class Togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        System.out.println("Toggled String = " + result);
    }
}