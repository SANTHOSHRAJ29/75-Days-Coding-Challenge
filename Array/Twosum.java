package Array;
import java.util.*;
import java.util.logging.Logger;
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Twosum.class.getName());
        Twosum ts = new Twosum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        logger.log(java.util.logging.Level.INFO, "Indices: {0}, {1}", new Object[] { result[0], result[1] });
    }
}