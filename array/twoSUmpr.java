package leetcode.array;

import java.util.HashMap;

public class twoSUmpr {

    public static void main(String[] args) {

        int[] result = twoSum(new int[]{-3,4,3,90}, 0);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {


                if (!hmap.containsKey(target - nums[i])) {
                    hmap.put(nums[i], i);
                } else {
                    result[1] = i;
                    result[0] = hmap.get(target - nums[i]);

                }
        }

        return result;
    }
}
