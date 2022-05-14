package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
    public static
    int[][] merge(int[][] sdd) {
        if (!(sdd.length > 0)) {
            return sdd;
        }
        int rowLe = sdd.length;
        int[] cache = new int[2];
        List<List<Integer>> l = new ArrayList<>();

        cache[0] = sdd[0][0];
        cache[1] = sdd[0][1];

        for (int i = 1; i < rowLe; i++) {

            List<Integer> kkk = new ArrayList<>();

            int pehlakabada = Math.max(cache[0], cache[1]);
            int dusrakachota = Math.min(sdd[i][0], sdd[i][1]);

            if (pehlakabada >= dusrakachota) {
                cache[0] = cache[0];
                cache[1] = sdd[i][1];
            } else {
                kkk.add(cache[0]);



                cache[0] = sdd[i][0];
                cache[1] = sdd[i][1];
                l.add(kkk);
            }

        }

        List<Integer> last = new ArrayList<>();
        last.add(cache[0]);
        last.add(cache[1]);
        l.add(last);


        int[][] blankarray = new int[l.size()][l.get(0).size()];



        for (int i = 0; i < blankarray.length; i++) {
            for (int j = 0; j < blankarray[0].length; j++) {
                blankarray[i][j] = l.get(i).get(j);
            }
        }


        return blankarray;
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
                {1, 4},
                {2, 3}
        };
        Arrays.sort(sdd, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.asList(merge(sdd)).stream().forEach(e-> Arrays.stream(e).forEach(System.out::println));



    }


}
