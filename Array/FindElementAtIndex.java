package Array;
import java.util.*;
public class FindElementAtIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean found = false;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Element is found at index "+i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Not found");
        }
    }
}