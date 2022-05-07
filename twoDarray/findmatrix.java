package leetcode.twoDarray;

public class findmatrix {
    public static void main(String[] args) {

        int arr[][] = new int[][]{{1, 3, 5}, {4, 5, 6}, {7, 13, 9}};



        System.out.println();



        int n = 3;
//      for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = 2;
//            }
//        }
       boolean a = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(arr[i][j] == 11){
                   a = true;

               }
            }
            //System.out.println("");
        }
        System.out.println(a);

    }
}
