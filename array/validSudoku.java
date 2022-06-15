package leetcode.array;

import java.util.HashMap;

public class validSudoku {
    public static void main(String[] args) {

       /*char[][] board = {
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };*/





        char[][] board =
                {

                          {'.', '.', '.',    '.', '5', '.',   '.', '1', '.'},
                          {'.', '4', '.',    '3', '.', '.',   '.', '.', '.'},
                          {'.', '.', '.',    '.', '.', '5',   '.', '.', '2'},
                          //-----------------------------------------------//
                          {'8', '.', '.',    '.', '.', '.',    '.', '2', '.'},
                          {'.', '.', '2',    '.', '7', '.',    '.', '.', '.'},
                          {'.', '1', '5',    '.', '.', '.',    '.', '.', '.'},
                          //-----------------------------------------------//
                          {'.', '.', '.',    '.', '.', '2',    '.', '.', '.'},
                          {'.', '2', '.',    '9', '.', '.',    '.', '.', '.'},
                          {'.', '.', '4',    '.', '.', '.',    '.', '.', '.'}
                };


        System.out.println(originalDigits(board));


    }


    public static boolean originalDigits(char[][] chr) {
        int row = chr.length;
        int column = chr[0].length;
        boolean isValidSudoKu = true;
        HashMap rowMap = new HashMap();
        HashMap columnMap = new HashMap();
        HashMap threeD = new HashMap();

        for (int i = 0; i < row; i++) {
            rowMap.clear();
            columnMap.clear();
            for (int j = 0; j < column; j++) {
                if (chr[i][j] != '.') {

                    if (rowMap.containsValue(chr[i][j])) {
                        isValidSudoKu = false;
                        return false;
                    } else {
                        rowMap.put(i + ':' + j, chr[i][j]);
                    }
                }

                if (chr[j][i] != '.') {
                    if (columnMap.containsValue(chr[j][i])) {
                        isValidSudoKu = false;
                        return false;
                    } else {
                        columnMap.put(j + +'c' + +i, chr[j][i]);
                    }

                }


            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                threeD.clear();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {

                        if (chr[i + k][j + l] != '.') {
                            if (threeD.containsValue(chr[i + k][j + l])) {
                                isValidSudoKu = false;
                                return false;
                            } else {
                                threeD.put((i + k )+ "3d"+ (j + l), chr[i + k][j + l]);
                            }

                        }
                    }
                }
            }
        }

        return isValidSudoKu;
    }

}
