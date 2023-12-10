package Weekly;

import java.util.HashMap;

public class problem3 {

    public static int countSubArrays(int[] arr, int k) {

        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.get(max) >= k) {
                count += arr.length - right;
                map.put(arr[left], map.getOrDefault(arr[left], 0) - 1);
                if (arr[left] == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            right++;
        }
        return count;

    }
}
