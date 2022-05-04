package leetcode.array;

public class sort0and1and2 {
    public static void main(String[] args) {

        int a[] = {1, 2, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] == 0){
                count0++;
            }
            if(a[i] == 1){
                count1++;
            }
            if(a[i] == 2){
                count2++;
            }

        }


    }
}
