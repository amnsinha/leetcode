package leetcode.binarySearch;

public class pivotElement {


    static int binarySearch(int target) {

        //int[] elements = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 16, 17, 18};
        //int[] elements = new int[]{4, 5, 6, 7, 0, 1, 2};
        //int[] elements = new int[]{2,3,1};
        //int[] elements = new int[]{2,1};
        //int[] elements = new int[]{2, 3, 4, 5, 6, -1, 0, 1};
        //int[] elements = new int[]{11, 13, 15, 17};
        //int[] elements = new int[]{4,5,6,7,0,1,2};
        int[] elements = new int[]{0,10,5,2};
        //int[] elements = new int[]{3, 4, 5, 6, 1};
        int lo = 0;
        int hi = elements.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (elements[mid] < elements[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(6));
    }
}
