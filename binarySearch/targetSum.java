package leetcode.binarySearch;

public class targetSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        int[] result = new int[2];
        result[1] = -1;

        while (low < high) {
            int sum = low + high;
            if (target == sum) {
                result[0] = low + 1;
                result[1] = high + 1;
                return result;
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return result;
    }
}



