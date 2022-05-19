package leetcode.array;

public class ROmantoint {

    public static void main(String[] args) {
        //LVIII"
        //"MCMXCIV"
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int[] romanIndex = new int[3999];

        romanIndex['I'] = 1;
        romanIndex['V'] = 5;
        romanIndex['X'] = 10;
        romanIndex['L'] = 50;
        romanIndex['C'] = 100;
        romanIndex['D'] = 500;
        romanIndex['M'] = 1000;

        int count =  romanIndex[s.charAt(0)];;
        for (int i = 0; i < s.length() - 1; i++) {

            int currentcount = romanIndex[s.charAt(i)];
            int nextIndex = romanIndex[s.charAt(i+1)];
            if (currentcount < nextIndex) {
                count = count + (nextIndex - currentcount - currentcount);
            } else {
                count = count + nextIndex;
            }
        }
        return count;


    }
}
