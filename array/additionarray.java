package leetcode.array;

import java.util.Arrays;

class additionarraysss {
    String colors = "ABBBBBBBAAA";


    public static void main(String[] args) {
        int[] s = winnerOfGame(new int[]{9, 1, 9});
        Arrays.stream(s).forEach(System.out::println);

    }

    public static int[] winnerOfGame(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
