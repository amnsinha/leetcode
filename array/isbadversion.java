package leetcode.array;

public class isbadversion {
    public static void main(String[] args) {
System.out.println(firstBadVersion(30));
    }

    static boolean  isBadVersion(int version){
        if(version == 29)
            return true;

        if(version == 28)
            return true;

        if(version == 27)
            return true;

        if(version == 26)
            return true;

        if(version == 30)
            return true;

        return false;
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;


    }
}
