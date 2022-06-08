package leetcode.array;

import java.util.HashMap;

public class missingNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[] {
            2, 3, 4, 7, 11
        },9));
    }

    public static int findKthPositive(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int check = arr[arr.length - 1];
        int count = 0;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!map.containsKey(i)) {
                count++;
            }
            if (count == k) {
                return i;
            }
        }
        return -1;
    }
}
