package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingRange {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0, upper = 99;

        List<String> ans = findMissingRanges(nums, lower, upper);
        ans.stream().forEach(System.out::println);
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> answers = new ArrayList<>();
        if (nums.length == 0) {
            return answers;
        }

        if (nums.length == 1 && lower == upper) {
            return answers;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int difference = nums[i + 1] - nums[i];
            if (difference >= 2) {
                int from = nums[i] + 1;
                int to = nums[i + 1] - 1;

                if(from == to){
                    answers.add(from+"");
                }
                else{
                    answers.add(from + "->" + to);
                }

            }
        }

        if(nums[nums.length - 1] != upper){
            int from = nums[nums.length - 1] + 1;
            int to = upper;
            answers.add(from + "->" + to);
        }

        return answers;
    }

}
