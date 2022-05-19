package leetcode.binarySearch;

import java.util.Arrays;

public class basic {


    public static void main(String[] args) {

        System.out.println(binarySearch(6));
    }

    private static boolean binarySearch(int target) {

        int[] elements = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18};


        //Arrays.binarySearch(elements, 13)

        int start = 0;
        int end = elements.length - 1;
        int mid = (start + end) / 2;

        Boolean b = false;
        while (start <= end) {

            if (target == elements[mid]) {
                b = true;
                break;
            }


            if (target < elements[mid]) {
                end = mid - 1;


            } else if (target > elements[mid]) {
                start = mid + 1;

            }
            mid = (end + start) / 2;


        }

        return b;
    }
}
