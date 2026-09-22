package String;
import java.util.*;
public class OnlyAlphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean onlyAlphabets = true;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z'))) {
                onlyAlphabets = false;
                break;
            }
        }
        if (onlyAlphabets) {
            System.out.println("String contains only alphabets");
        }
        else {
            System.out.println("String does not contain only alphabets");
        }

    }
}