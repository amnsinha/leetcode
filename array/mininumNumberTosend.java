package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class mininumNumberTosend {

    public static int days(List<Integer> parcel, int count) {
        //find min every time
        int min = Integer.MAX_VALUE;
        for (Integer i : parcel) {
            if (i == 0) continue;
            min = Math.min(min, i);
        }
        // if min is default which means all zeros
        if (min == Integer.MAX_VALUE)
            return count;

        // decrement parcel
        for (int i = 0; i < parcel.size(); i++) {
            if (parcel.get(i) == 0) continue;
            parcel.set(i, parcel.get(i) - min);
        }
        return days(parcel, ++count);
    }

    public static void main(String[] args) {
        List<Integer> parcel = new ArrayList<>();
        parcel.add(2);
        parcel.add(3);
        parcel.add(4);
        parcel.add(3);
        parcel.add(3);

        String s = "Asdas";

        char d = s.charAt(1);

        if(d+"" == "d")
        System.out.println(days(parcel, 0));

    }



}
