package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twointersection {

    public static void main(String[] args) {
        //  int[] a = intersect(new int[]{3,1,2}, new int[]{1,1});
        // int[] a = intersect(new int[]{1,2,2, 1}, new int[]{2,2});
        int[] a = intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] lowerint = new int[0];
        int[] highint = new int[0];

        if (nums1.length > nums2.length) {
            lowerint = new int[nums2.length];
            highint = new int[nums1.length];
            lowerint = nums2;
            highint = nums1;
        } else {
            lowerint = new int[nums1.length];
            highint = new int[nums2.length];
            lowerint = nums1;
            highint = nums2;
        }

        List<Integer> list = Arrays.stream(highint).boxed().collect(Collectors.toList());

        List<Integer> newsad = new ArrayList<>();
        for (int i = 0; i < lowerint.length; i++) {
            if (list.contains(lowerint[i])) {
                newsad.add(lowerint[i]);
                int remove = list.indexOf(lowerint[i]);
                list.remove(remove);
            }
        }
        return newsad.stream().mapToInt(e -> e).toArray();
    }

}
