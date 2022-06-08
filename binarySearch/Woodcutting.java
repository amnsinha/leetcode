package leetcode.binarySearch;

import java.util.Arrays;

public class Woodcutting {


    public static void main(String[] args) {
        int[] arr = new int[]{15, 8, 18, 6};
        int m = minimumCutterlength(arr, 4);


    }

    private static int minimumCutterlength(int[] arr, int n) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = 0;
        int ans = -1;
        int target = 30;
        int totalSum = 0;


        while (min < max) {


            int mid = (min + max) / 2;

            if (isPossibleSolution(mid, arr, target, totalSum)) {
                ans = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }


        }


        return ans;
    }

    private static boolean isPossibleSolution(int mid, int[] arr, int target, int totalSum) {
        Boolean b = false;

        for (int i : arr) {
            int diffe = 0;
            if (i > mid) {
                diffe = i - mid;
                totalSum = totalSum + diffe;
            }
        }

        if (totalSum >= target) {
            b = true;
        }

        return b;
    }


}
