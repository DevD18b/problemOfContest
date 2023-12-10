package Weekly;

import java.util.*;

public class problem2 {

    // learn to design your own customer power function.

    public static int pow(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = result * base;
            }
            base = base * base;
            exponent /= 2;
        }
        return result;
    }

    public static List<Integer> goodIndicesProblem(int[][] arr, int target) {

        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int c = arr[i][2];
            int m = arr[i][3];
            int product1 = 1;
            // (a^b%10)^c
            for (int j = 0; j < b; j++) {
                product1 *= (a) % 10;
            }
            int product2 = 1;
            for (int k = 0; k < c; k++) {
                product2 *= (product1) % m;
            }
            if (product2 == target) {
                index.add(i);
            }
        }
        return index;
    }
}
