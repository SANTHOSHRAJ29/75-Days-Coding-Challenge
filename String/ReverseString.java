package String;
import java.util.*;
public class ReverseString {
public static String reverseString(String str) {
    char[] arr = str.toCharArray();
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    return new String(arr);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = reverseString(str);
        System.out.println(result);
    }
}
