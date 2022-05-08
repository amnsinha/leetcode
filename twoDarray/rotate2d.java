package leetcode.twoDarray;

import java.util.ArrayList;
import java.util.List;

public class rotate2d {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rotatedArray[][] = new int[3][3];

        int row = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rotatedArray[i][j] = arr[j][i];
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(rotatedArray[i][j]);
            }
            System.out.println("");
        }

    }
}
