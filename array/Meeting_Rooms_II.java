package leetcode.array;

import java.util.Arrays;

public class Meeting_Rooms_II {
    public static void main(String[] args) {
        //System.out.println(minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}}));
        // System.out.println(minMeetingRooms(new int[][]{{6, 15}, {6, 17}, {13, 20}}));
        System.out.println(minMeetingRooms(new int[][]{{4, 9}, {4, 17}, {9, 10}}));
    }


    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int roomAllocated = 1;
        int lastTIme = -1;
        for (int[] interval : intervals) {
            lastTIme = interval[1];
            if (interval[0] < lastTIme) {
                roomAllocated++;
            }
        }
        return roomAllocated;
    }
}
