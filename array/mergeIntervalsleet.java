package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mergeIntervalsleet {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
              /*   int[][] sdd = new int[][]{
                {1, 3},
                {2, 9},
                {8, 10},
        };*/

    /*    int[][] sdd = new int[][]{
                {1, 4},
                {3, 5}
        };*/

   /*     int[][] sdd = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18},
        };*/

     /*   int[][] sdd = new int[][]{
                {1, 3},
                {5, 9},
                {8, 10},
                {10, 18},
        };*/


        int[][] sdd = new int[][]{
                {1, 3},
                {5, 9},
                {8, 10},
                {10, 18},
        };
        Arrays.sort(sdd, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.asList(merge(sdd)).stream().forEach(e-> Arrays.stream(e).forEach(System.out::println));



    }


}
