package leetcode.twoDarray;

public class spiral {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 2, 3, 11},
                {4, 5, 6, 12},
                {7, 8, 9, 13},
                {27, 48, 78, 10}
        };
        int rotatedArray[][] = new int[3][3];


        int starRow = 0;
        int endRow = arr.length - 1;
        int starColumn = 0;
        int endColumn = arr.length - 1;

        int row = arr.length;
        int column = arr[0].length;

        for (int i = starRow; i < row; i++) {
            System.out.print(arr[starRow][i]);
        }

        System.out.println("");
        for (int i = 1; i <= endColumn; i++) {
            System.out.print(arr[i][endColumn]);
        }
        endColumn--;

        System.out.println("");
        for (int i = endColumn; i >= 0; i--) {
            System.out.print(arr[endRow][i]);
        }
        endRow--;

       /* for (int i = endRow; i < starRow; i++) {
            System.out.print(arr[starRow][endRow]);
        }*/

        System.out.println("");

   /*     for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(rotatedArray[i][j]);
            }
            System.out.println("");
        }*/

    }
}
