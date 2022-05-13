package leetcode.twoDarray;

import java.util.Arrays;
import java.util.Vector;

public class findmedian {
    public static void main(String[] args) {


        int arr[][] = new int[][]{
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        int row = arr.length;
        int column = arr[0].length;
        int newarray[] = new int[arr.length * arr[0].length];

        int newarrayindex = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newarray[newarrayindex] = arr[i][j];
                newarrayindex++;
            }
        }
        Arrays.sort(newarray);
        int medianIndex = (newarray.length / 2);

        System.out.println(newarray[medianIndex]);
    }
}
