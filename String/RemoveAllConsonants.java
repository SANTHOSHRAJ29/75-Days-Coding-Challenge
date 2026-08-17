package String;
import java.util.*;
public class RemoveAllConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        String s = "";
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                s += ch;
            }
            else{
                s += "";
            }
        }
        System.out.println(s);
    }
}
