package Array;
import java.util.*;
public class MoveAllNegativeNumbersToBeginning {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean check=false;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        int temp[] = new int[n];
        for(int num:arr)
        {
           if(num<0)
           {
               temp[j++]=num;
           }
        }
        for(int num:arr)
        {
            if(num>=0)
            {
                temp[j++]=num;
            }
        }
        Arrays.sort(temp);
        for(j=0;j<n;j++)
        {
            System.out.print(temp[j]+" ");
        }

    }
}
