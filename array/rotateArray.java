package leetcode.array;

import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args) {


        int nums[] = new int[]{1,2,3,4,5,6,7};
        int numIndex = nums.length - 1;
        int k = 3;


       int copiedArray [] = Arrays.copyOfRange(nums, k+1, numIndex+1);
       int copiedArrsad [] = Arrays.copyOfRange(nums, 0, k+1);

        int[] result = new int[copiedArray.length + copiedArrsad.length];  //resultant array of size first array and second array
        System.arraycopy(copiedArray, 0, result, 0, copiedArray.length);
        System.arraycopy(copiedArrsad, 0, result, copiedArray.length,  copiedArrsad.length);

        System.out.println("dasd");

    }

}
