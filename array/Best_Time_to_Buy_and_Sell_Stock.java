package leetcode.array;

public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));


    }


    public static int maxProfit(int[] prices) {
        int largestprofit = 0;
        int minSofar = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minSofar){
                minSofar = prices[i];
            }
            else {
                largestprofit = Math.max(largestprofit, prices[i]-minSofar);
            }


        } return largestprofit;
    }

}
