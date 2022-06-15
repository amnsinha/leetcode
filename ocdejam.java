package leetcode;
class ocdejam {
    public static void main(String args[]){
        System.out.println(
                distributeCandy(7,3,new int[]{1,2,3,4,5,6,7}));

    }



    public static int distributeCandy(int bag, int child,
                                      int[] candies){

        int sum = 0;
        for(int i : candies)
            sum+=i;

        int remainder =  sum / child;

        return sum - remainder;
    }


}
