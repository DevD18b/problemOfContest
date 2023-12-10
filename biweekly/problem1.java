package biweekly;

import java.util.ArrayList;

public class problem1 {
    public static int[] solver(int[] arr1, int[] arr2) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            ans.add(arr1[i]);
        }

        int count1 = 0;
        for (int j : arr2) {
            if (ans.contains(j)) {
                count1++;
            }
        }

        int count2 = 0;
        ans = new ArrayList<>();

        for (int j : arr2) {
            ans.add(j);
        }
        for (int i : arr1) {
            if (ans.contains(i)) {
                count2++;
            }
        }
        return new int[] { count2, count1 };

    }
}