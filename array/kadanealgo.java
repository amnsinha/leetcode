package leetcode.array;

public class kadanealgo {

    public static void main(String[] args) {
        System.out.println(maxSumsubarray(new int[]{-2,-3,4,-1,-2,1,5,-3}));
    }

    private static int maxSumsubarray(int[] arr) {

        int maxSF = Integer.MIN_VALUE;
        int maxEH = 0;

        for(int i = 0; i < arr.length; i++){
            maxEH = maxEH + arr[i];
            maxSF = Math.max(maxEH, maxSF);

            if(maxEH < 0)
                maxEH = 0;
        }


        return maxSF;
    }
}
