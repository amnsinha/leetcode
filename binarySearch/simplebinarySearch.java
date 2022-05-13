package leetcode.binarySearch;

public class simplebinarySearch {
    public static void main(String[] args) {


        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;

        System.out.println(binarySearch(arr, arr.length, target));
    }

    private static boolean binarySearch(int[] arr, int length, int target) {


        int start = 0;
        int end = length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {
            int midelement = arr[mid];


            if (midelement == target) {
                return true;
            }
            if (target < midelement) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }
}
