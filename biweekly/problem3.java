package biweekly;

import java.util.HashMap;

public class problem3 {

    public static int solver(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.get(arr[right]) > k) {
                map.put(arr[left], map.getOrDefault(arr[left], 0) - 1);
                if (arr[left] == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

}
