package String;
import java.util.*;
public class FindUniqueWordUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.toLowerCase().split("\\s+");

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words) {
            // If add() returns false, it means the word is already in uniqueWords
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }
        System.out.println("Duplicate words: " + duplicateWords);
    }
}
