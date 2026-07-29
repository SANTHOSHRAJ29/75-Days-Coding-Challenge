package String;
import java.util.*;
public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }
            chars[write] = current;
            write++;
            if (count > 1) {
                String str = String.valueOf(count);
                for (int i = 0; i < str.length(); i++) {
                    chars[write] = str.charAt(i);
                    write++;
                }
            }
        }
        return write;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        while (sc.hasNextLine()) {
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                break;
            }
        }
        if (input == null || input.isEmpty()) {
            return;
        }

        List<Character> charList = new ArrayList<>();
        if (input.startsWith("[") && input.endsWith("]")) {
            String inner = input.substring(1, input.length() - 1);
            Scanner listScanner = new Scanner(inner).useDelimiter("\\s*,\\s*");
            while (listScanner.hasNext()) {
                String token = listScanner.next().trim();
                if (token.startsWith("\"") && token.endsWith("\"") && token.length() >= 2) {
                    token = token.substring(1, token.length() - 1);
                } else if (token.startsWith("'") && token.endsWith("'") && token.length() >= 2) {
                    token = token.substring(1, token.length() - 1);
                }
                if (!token.isEmpty()) {
                    charList.add(token.charAt(0));
                }
            }
        } else {
            Scanner tokenScanner = new Scanner(input);
            if (tokenScanner.hasNextInt()) {
                int n = tokenScanner.nextInt();
                while (tokenScanner.hasNext() && charList.size() < n) {
                    charList.add(tokenScanner.next().charAt(0));
                }
                while (charList.size() < n && sc.hasNext()) {
                    charList.add(sc.next().charAt(0));
                }
            } else {
                if (input.contains(" ")) {
                    Scanner wordScanner = new Scanner(input);
                    while (wordScanner.hasNext()) {
                        String token = wordScanner.next();
                        if (!token.isEmpty()) {
                            charList.add(token.charAt(0));
                        }
                    }
                } else {
                    for (char c : input.toCharArray()) {
                        charList.add(c);
                    }
                }
            }
        }

        char[] chars = new char[charList.size()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = charList.get(i);
        }

        int length = compress(chars);
        System.out.println(length);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
