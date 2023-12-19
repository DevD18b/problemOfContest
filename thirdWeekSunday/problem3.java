import java.util.*;

public class problem3 {
    public static int minCost(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int low = median;
        int high = median;
        while (!isPalindrome(low)) {
            low--;
        }
        while (!isPalindrome(high)) {
            high++;
        }
        int ans1 = 0;
        int ans2 = 0;
        for (int i : nums) {
            ans1 += Math.abs(low - i);
            ans2 += Math.abs(high - i);
        }
        return Math.min(ans1, ans2);
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse *= 10 + digit;
            temp /= 10;
        }
        return reverse == temp;
    }
}
