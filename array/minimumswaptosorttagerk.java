package leetcode.array;

public class minimumswaptosorttagerk {

    public static void main(String[] args) {
        int arr[] = {10, 12, 20, 20, 5, 19, 19, 12, 1, 20, 1};
        int k = 11;
        int n = arr.length;
        int good = 0, bad = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k)
                good++;
        }
        for (int i = 0; i < good; i++) {
            if (arr[i] > k)
                bad++;
        }
        int ans = bad;
        for (int i = 0, j = good; j < n; i++, j++) {
            if (arr[i] > k) {
                bad--;
            } ;
            if (arr[j] > k) {
                bad++;
            } ;

            ans = Math.min(ans, bad);
        }

        System.out.println(ans);
        // return ans;


    }


}
