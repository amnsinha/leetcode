package leetcode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class peopleseeright {


    public static int[] findBuildings(int[] height) {

        int[] currentHeight = Arrays.stream(height).filter(num -> num != 0).toArray();

        LinkedList<Integer> addedinview = new LinkedList<>();
        LinkedList<Integer> finalOutput = new LinkedList<>();
        int counterCanSeepeople = 0;
        //3,1,2,1,1
        for (int i = currentHeight.length - 1; i >= 0; i--) {
            if (addedinview.isEmpty()) {
                addedinview.add(i);
                finalOutput.add(0);
            } else if (currentHeight[i] >= currentHeight[addedinview.getLast()]) {
                counterCanSeepeople++;
                addedinview.add(i);
                finalOutput.add(counterCanSeepeople);

            } else if (currentHeight[i] > currentHeight[i + 1] && currentHeight[i] < currentHeight[addedinview.getLast()] && currentHeight[i + 1] != currentHeight[addedinview.getLast()]) {
                counterCanSeepeople++;
                finalOutput.add(counterCanSeepeople);
            } else if (currentHeight[i] <= currentHeight[i + 1]) {
                finalOutput.add(1);
            } else {
                finalOutput.add(1);
            }
        }
        Collections.reverse(finalOutput);
        return finalOutput.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        //Arrays.stream(findBuildings(new int[]{5,1,2,3,10})).forEach(System.out::println);
        Arrays.stream(findBuildings(new int[]{5,4,3,2,1})).forEach(System.out::print);
    }


}
