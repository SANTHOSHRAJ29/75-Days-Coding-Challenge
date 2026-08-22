package Array;
public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5};
        int n = arr.length;
        boolean check =true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                check = false;
            }
        }
        if(check)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
