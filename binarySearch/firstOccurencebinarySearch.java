package leetcode.binarySearch;

public class firstOccurencebinarySearch {
    public static void main(String[] args) {


        int arr[] = {3, 4, 5, 5, 5, 5, 8, 12};
        int target = 5;

        System.out.println(binarySearch(arr, arr.length, target));
    }

    private static int binarySearch(int[] arr, int length, int target) {

        int start = 0;
        int end = length - 1;
        int mid = (start + end) / 2;
        int foundat = -1;

        while (start <= end) {
            if (arr[mid] == target) {
                foundat = mid;
                end = mid - 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return foundat;


    }
}
