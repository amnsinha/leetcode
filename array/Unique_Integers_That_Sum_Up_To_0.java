package leetcode.array;

import java.util.Arrays;

class Unique_Integers_That_Sum_Up_To_0 {

    public static void main(String[] args) {
        System.out.println(sumZero(5));
    }

    public static int[] sumZero(int n) {
        int blankarry[] = new int[n];

        if (n == 1) {
            blankarry[0] = 0;
        } else {
            for (int i = 0; i < n; i++) {
                blankarry[i] = 2*i - n + 1;
            }

        }
        Arrays.stream(blankarry).forEach(System.out::println);
        return blankarry;
    }

}
