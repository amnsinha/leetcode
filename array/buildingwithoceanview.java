package leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class buildingwithoceanview {


    public static int[] findBuildings(int[] heights) {


        LinkedList<Integer> addedinview = new LinkedList<>();
        for (int i = heights.length-1; i >= 0; i--) {
            if (addedinview.isEmpty() || heights[addedinview.getLast()] < heights[i]) {
                addedinview.add(i);
            }
        }
        Collections.reverse(addedinview);
        return addedinview.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(findBuildings(new int[]{4,2,3,1})).forEach(System.out::println);
    }


}
