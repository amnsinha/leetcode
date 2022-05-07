package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int a[] = {1,2,1,2,1};

        int target = 3;
        List<Integer> blankarray = new ArrayList<>();

        //blankarray[0] = a[0];

        int i = 1;
        blankarray.add(0, a[0]);
        while (i <= a.length - 1) {
            blankarray.add(blankarray.get(i - 1) + a[i]);
            if (blankarray.get(i) ==
                    +target) {
                System.out.println("till" + i);
                break;
            }
            i++;
        }
        blankarray.forEach(System.out::println);




        /* for (int i = 0; i < a.length - 1; i++) {



        }*/


    }


}
