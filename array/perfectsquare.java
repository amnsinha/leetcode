package leetcode.array;

public class perfectsquare {
    public static void main(String[] args) {

        int a = 64;
        System.out.println(isPerfectSquare(a));



    }


    public static boolean isPerfectSquare(int n) {
        for (int i = 1; i * i <= n; i++) {


            // If (i * i = n)
            if ((n % i == 0) && (n / i == i)) {
                return true;
            }
        }
        return false;
    }
}
