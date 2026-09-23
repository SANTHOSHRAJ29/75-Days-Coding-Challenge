package String;
import java.util.*;
public class OnlyDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean onlyDigits = true;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                onlyDigits = false;
                break;
            }
        }
        if (onlyDigits) {
            System.out.println("String contains only digits");
        }
        else {
            System.out.println("String does not contain only digits");
        }
    }
}