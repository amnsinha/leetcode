/*
package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        double halflength = arr.length / 2.0;

        Arrays.sort(arr);

   ab     // Function calling
        findMajority(arr, halflength);
    }

    private static void findMajority(int[] arr, double halflength) {

        int count = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] == arr[i - 1]) {
                count++;
                System.out.println(arr[i]);
            } else {
                count = 1;
            }

        }

    }
}
*/
