package leetcode.twoDarray;

public class rotate2dSecondApproach {


    static int[][] movearray(int[][] matrix, int count) {

        int n = matrix.length;
        int column = matrix[0].length;

        int[][] rotatedArray = new int[n][column];

        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        count--;
        if(count == 0)
            return matrix;


        movearray(matrix, count);
        return matrix;


    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] row = movearray(arr, 1);

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < row[0].length; j++) {
                System.out.print(row[i][j]);
            }
            System.out.println();
        }


    }
}
