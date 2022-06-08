package leetcode.array;

public class arranginCode {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(67));
    }


    public static int arrangeCoins(int n) {
/*

        if (n == 3) {
            return 2;
        }

        if (n <= 2) {
            return 1;
        }
*/


        int result = 0;
        int thresholdCounter = 0;
        int naturalCount = 1;
        while (thresholdCounter < n) {

            int temp = naturalCount+1;
            thresholdCounter+=temp;

            naturalCount++;
            result++;
        }
        return result;

    }
}
