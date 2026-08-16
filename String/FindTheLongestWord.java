package String;
import java.util.*;
public class FindTheLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
