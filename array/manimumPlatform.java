package leetcode.array;

import java.util.Arrays;

public class manimumPlatform {

    public static void main(String[] args) {


        int arr[] = new int[]{900, 940, 950, 1100, 1500, 1800};
        int dep[] = new int[]{910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);
        int platformrequired = 1;
        int arrivaltrain = 1;
        int departuretrain = 0;
        while (arrivaltrain < arr.length - 1) {
            if (arr[arrivaltrain] <= dep[departuretrain]) {
                platformrequired++;
            } else {
                departuretrain++;
            }
            arrivaltrain++;
        }
        System.out.println(platformrequired);
    }


}
