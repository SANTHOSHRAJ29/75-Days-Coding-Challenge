package Array;
import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println(map.get(target - arr[i]) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No solution");
    }
}
