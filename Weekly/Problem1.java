package Weekly;

public class Problem1 {

    public static int solver(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int j = i + 1;
                count++;
                while (j < arr.length) {
                    arr[j] = arr[j] - 1;
                    j++;
                }
            }
        }
        return count;

    }
}
