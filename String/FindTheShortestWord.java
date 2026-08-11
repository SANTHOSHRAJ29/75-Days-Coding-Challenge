package String;
import java.util.*;
public class FindTheShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longestWord = "name";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Shortest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
