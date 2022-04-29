package leetcode;

import java.util.HashMap;

public class rough {
    public static void main(String[] args) {
        int moneystack[] = new int[]{1,3,5};
        System.out.println(coinChange(moneystack, 9));
    }


    public static int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }
        int totalCoin = -1;
        HashMap<Integer, Integer> hmap = new HashMap();

        int maxCoint = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount){
                maxCoint = Math.max(coins[i], maxCoint);
                hmap.put(coins[i], i);
            }
        }

        int howmuchCoin = 0;
        int howmuchRemain = 0;
        if (maxCoint > 0) {
            howmuchCoin = amount / maxCoint;
            howmuchRemain = amount % maxCoint;  
        }
    
        if (hmap.containsKey(howmuchRemain)) {
            totalCoin = howmuchCoin + howmuchRemain;
        }
        if (howmuchCoin > 0 && howmuchRemain == 0) {
            totalCoin = howmuchCoin;
        }


        return totalCoin;
    }
}
