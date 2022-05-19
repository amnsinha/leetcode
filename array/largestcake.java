package leetcode.array;

import java.util.Arrays;

public class largestcake {


    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        int n = horizontalCuts.length;
        int m = verticalCuts.length;


        long maxHeight = Math.max(horizontalCuts[0], h - horizontalCuts[n - 1]);
        long maxWidth = Math.max(verticalCuts[0], w - verticalCuts[m - 1]);


        for (int i = 1; i < n; i++) {
            maxHeight = Math.max(maxHeight, horizontalCuts[i] - horizontalCuts[i - 1]);
        }


        for (int i = 1; i < m; i++) {
            maxWidth = Math.max(maxWidth, verticalCuts[i] - verticalCuts[i - 1]);
        }
        return  Math.abs((int) ((maxWidth * maxHeight) % (1000000007)));
    }

    public static void main(String[] args) {


        int h = 8, w = 5;
        int[] horizontalCuts = new int[]{5, 2, 6, 3};
        int[] verticalCuts = new int[]{1, 4};

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        System.out.println(maxArea(h, w, horizontalCuts, verticalCuts));

    }
}
