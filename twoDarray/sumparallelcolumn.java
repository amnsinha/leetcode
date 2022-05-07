package leetcode.twoDarray;

import java.util.ArrayList;
import java.util.List;

public class sumparallelcolumn {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {3, 5, 11, 2},
                {7, 9, 8, 0},
                {5, 0, 1, 3}
        };

        int row = arr.length;
        int column = arr[0].length;
        List arrayList = new ArrayList();
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum);

        }
        arrayList.forEach(System.out::println);
    }

    int n = 3;
    //      for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = 2;
//            }
//        }
    boolean a = false;
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 11) {
                    a = true;

                }
            }
            //System.out.println("");
        }*/
    // System.out.println(a);

}
