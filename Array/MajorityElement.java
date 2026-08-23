package Array;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count;
        for(int i = 0;i < n ;i++){
            count = 0;
            for(int j = 0;j < n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }
}
