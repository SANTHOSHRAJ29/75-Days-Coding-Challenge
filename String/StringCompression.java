package String;
import java.util.*;
public class StringCompression {

    public static int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char current = chars[read];
            int count = 0;

            // Count same consecutive characters
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write] = current;
            write++;

            // Write the count if greater than 1
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

        // Number of characters
        int n = sc.nextInt();

        char[] chars = new char[n];

        // Input characters
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        int length = compress(chars);

        System.out.println(length);

        System.out.print("Compressed Array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}