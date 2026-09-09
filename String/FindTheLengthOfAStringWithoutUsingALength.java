package String;
import java.util.*;
public class FindTheLengthOfAStringWithoutUsingALength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for (char character : str.toCharArray()) {
            count++;
        }
        System.out.println("Length = " + count);
    }
}