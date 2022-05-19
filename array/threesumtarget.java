package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesumtarget {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};


        System.out.println(threeSum(arr));



    }


    public static  List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>  a = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int target = arr[i] - 0;
            int startIndex = 0;
            int endIndex = arr.length - 1;
            while (startIndex < endIndex) {
                List local = new ArrayList();
                if ((arr[startIndex] + arr[endIndex]) == target && arr[startIndex]!=target && arr[endIndex]!=target) {
                    local.add(arr[i]);
                    local.add(arr[startIndex]);
                    local.add(arr[endIndex]);
                    a.add(local);
                    //  System.out.println("found target:"+ arr[i] +"/" + arr[startIndex] + "/" + arr[endIndex]);
                    break;
                } else if ((arr[startIndex] + arr[endIndex]) > target) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }
        }
        return a;

    }


}
