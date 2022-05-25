package leetcode.binarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Check_If_N_and_Its_Double_Exist {

    public static void main(String[] args) {
        //int[] arr = new int[]{3,1,7,11};
        int[] arr = new int[]{-10,12,-20,-8,15};

        System.out.println(findIfdoubleExist(arr));

    }

    private static boolean findIfdoubleExist(int[] arr) {
        Boolean b = false;
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i] * 2) || arr[i] % 2 == 0 && set.contains(arr[i]/ 2)) {
                b = true;
            }
            set.add(arr[i]);
        }
        return b;
    }

    /*    Arrays.sort(arr);

    int start = 0;
    int end = arr.length - 1;
    int mid = (start + end) / 2;

    int getSomeElement = 0;


        while (start > end) {


        if (arr[getSomeElement] ==)


    }


        Arrays.stream(arr).forEach(System.out::println);
        return b;*/


}
