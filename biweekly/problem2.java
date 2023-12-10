package biweekly;

public class problem2 {

    public static int removeAllAdjacent(String str) {

        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) || Math.abs(str.charAt(i) - str.charAt(i - 1)) == 1) {
                count++;
                i += 2;
            } else {
                continue;
            }
        }
        return count;

    }
}
