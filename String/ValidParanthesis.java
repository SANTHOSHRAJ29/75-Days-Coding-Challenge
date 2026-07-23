package String;
import java.util.*;
public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack <Character>();
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the parentheses string
        String s = sc.nextLine();
        if (isValid(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}