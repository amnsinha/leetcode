package leetcode.array;

import java.util.Arrays;

public class threesumtarget {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1};


        Arrays.sort(arr);
        // -1,2,4,5,7


       for(int i = 0; i < arr.length; i++) {
           int target = 4;
           int startIndex = 0;
           int endIndex = arr.length - 1;
           while (startIndex < endIndex) {
               if ((arr[startIndex] + arr[endIndex]) == target) {
                   System.out.println("found target:"+ arr[i] +"/" + arr[startIndex] + "/" + arr[endIndex]);
                   break;
               } else if ((arr[startIndex] + arr[endIndex]) > target) {
                   endIndex--;
               } else {
                   startIndex++;
               }
           }
       }


    }


}
