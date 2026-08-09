package Array;
import java.util.*;
public class ChocolateDistributionProblem {
    public static int findMinDifference(int[] arr, int m) {
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i + m <= arr.length; i++) {
            int difference = arr[i + m - 1] - arr[i];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int result = findMinDifference(arr, m);
        System.out.println(result);
    }
}
