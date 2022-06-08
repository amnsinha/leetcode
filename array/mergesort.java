package leetcode.array;

import java.util.Arrays;

public class mergesort {
    public static long countInversions(int[] a){
        int n = a.length;

        // Base Case
        if(n <= 1) {
            return 0;
        }

        // Recursive Case
        int mid = n >> 1;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        long inversions = countInversions(left) + countInversions(right);

        int range = n - mid;
        int iLeft = 0;
        int iRight = 0;
        for(int i = 0; i < n; i++) {
            if(
                    iLeft < mid
                            && (
                            iRight >= range || left[iLeft] <= right[iRight]
                    )
            ) {
                a[i] = left[iLeft++];
                inversions += iRight;
            }
            else if(iRight < range) {
                a[i] = right[iRight++];
            }
        }

        return inversions;
    }

    public static void main(String[] args) {


            System.out.println(countInversions(new int[]{2,1,3}));
        }


    }

    
