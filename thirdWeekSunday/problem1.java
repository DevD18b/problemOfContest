import java.util.*;

class problem1 {
    public static int[] missingAndRepeated(int[][] arr) {
        int missing = 0;
        int repeat = 0;
        int[] a = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                a[index++] = arr[i][j];
            }
        }
        Arrays.sort(a);
        if (a[0] != 1) {
            missing = 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                repeat = a[i];
            } else if (a[i + 1] - a[i] > 1) {
                missing = a[i + 1];
            }
        }
        if (missing == 0) {
            missing = a[a.length - 1] + 1;
        }
        return new int[] { repeat, missing };
    }

}