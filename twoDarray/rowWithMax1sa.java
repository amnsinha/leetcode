package leetcode.twoDarray;

import java.util.Arrays;
import java.util.HashMap;

public class rowWithMax1sa {
    public static void main(String[] args) {


        int arr[][] = new int[][]
                {
                        {0, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 1}
                };

        int row = arr.length;
        int column = arr[0].length;
        int newarray[] = new int[arr.length * arr[0].length];

        HashMap hmap = new HashMap();
        int one = 1;
        for (int rowIndex = 0; rowIndex < row; rowIndex++) {
            for (int columnIndex = 0; columnIndex < column; columnIndex++) {
                if (arr[rowIndex][columnIndex] == 1) {
                    hmap.put(rowIndex, one);
               
                    one++;

                }

            }
            one = 1;
        }
        //System.out.println(hmap.entrySet());
    }
}
