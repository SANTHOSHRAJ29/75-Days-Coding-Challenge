package String;
import java.util.*;
public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = "";
        for(int i = 0;i < str1.length();i++){
            char ch = str1.charAt(i);
            result += ch;
        }
        result += " ";
        for(int i = 0;i < str2.length();i++){
            char ch = str2.charAt(i);
            result += ch;
        }
        System.out.println(result);
    }   
}
