package leetcode.binarySearch;

public class fiixedpoint {
    public static void main(String[] args) {


        int arr[] = {-10,-5,0,3,7};
        System.out.println(binarySearch(arr, arr.length ));
    }

    private static int binarySearch(int[] arr, int length) {

        int start = 0;
        int end = length - 1;
        int mid = (start + end) / 2;
        int foundat = -1;

        while (start <= end) {
            if (mid == arr[mid]) {
                foundat = mid;
            }
            if (mid < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return foundat;


    }
}
