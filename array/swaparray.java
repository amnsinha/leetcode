package leetcode.array;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 2, 7, 8, 10, 7, 4};
        int j = arr.length - 1;
        int max = 0;
        for (int i = j; i > 0; i--) {
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
       // Arrays.stream(newarr).forEach(System.out::println);


    }
}
