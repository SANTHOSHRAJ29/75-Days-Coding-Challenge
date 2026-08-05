package Array;
import java.math.BigInteger;
import java.util.*;
public class FactorialsOfLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fact = BigInteger.valueOf(1);
        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        // Convert factorial to String
        String number = fact.toString();
        ArrayList<Integer> result = new ArrayList<>();
        // Store each digit in the ArrayList
        for (int i = 0; i < number.length(); i++) {
            result.add(number.charAt(i) - '0');
        }
        System.out.println(result);
    }
}
