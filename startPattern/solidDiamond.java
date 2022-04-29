package leetcode.startPattern;

public class solidDiamond {
    public static void main(String[] args) {


        makePyramid(4);


    }

    private static void makePyramid(int input) {
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k <= input; k++) {

            for (int m = 1; m <= k; m++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= input - k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
