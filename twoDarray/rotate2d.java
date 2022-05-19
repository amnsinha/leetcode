package leetcode.twoDarray;

public class rotate2d {


    static int[][] movearray(int[][] arr, int count) {
        int row = arr.length;
        int column = arr[0].length;

        int[][] rotatedArray = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rotatedArray[j][i] = arr[i][j];
            }
        }
        count--;
        if(count == 0)
            return rotatedArray;


        movearray(rotatedArray, count);
        return rotatedArray;


    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] row = movearray(arr, 3);

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < row[0].length; j++) {
                System.out.print(row[i][j]);
            }
            System.out.println();
        }


    }
}
