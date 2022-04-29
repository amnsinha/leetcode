package leetcode.startPattern;

public class halfpyramid {
    public static void main(String[] args) {


        makePyramid(4);


    }

    private static void makePyramid(int input) {
        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }


            System.out.println(" ");
        }
    }
}
