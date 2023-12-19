import java.util.*;

public class problem2 {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][];
        int second = 2;
        int first = 0;
        int index = 0;
        while (second < nums.length) {
            if (nums[second] - nums[first] <= k) {
                result[index][0] = nums[second - 2];
                result[index][1] = nums[second - 1];
                result[index][2] = nums[second];
                first = second + 1;
                second += 3;
                index++;
            } else {
                return new int[][] {};
            }
        }
        return result;
    }
}
