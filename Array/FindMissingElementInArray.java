package Array;
import java.util.*;
public class FindMissingElementInArray {
    public static void findMissingElements(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Missing elements: ");
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];
            for (int j = current + 1; j < next; j++) {
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMissingElements(arr);
    }
}
