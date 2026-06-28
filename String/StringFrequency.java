package String;
import java.util.HashMap;
public class StringFrequency {
    public static void main(String[] args) {
        String input = "santhosh raj";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (ch == ' ') continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char key : map.keySet()) {
            System.out.print(key + "" + map.get(key) + " ");
        }
    }
}