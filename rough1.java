package leetcode;

public class rough1 {
    public static void main(String[] args) {
        int[] moneystack = new int[]{1, 3, 5};
        System.out.println(makeStar(4));
    }


    public static int makeStar(int q) {

        if (q == 0) {
            return 90;
        }

        System.out.println("****");

        q--;
        makeStar(q);
        return 90;
    }
}
