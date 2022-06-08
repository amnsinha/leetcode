package leetcode.array;

public class reverseChar {

    public static void main(String[] args) {
     System.out.println(reverseString(new char[]{'h','e','l','l','o'})); // o,l,l,e,h
    }

    public static boolean reverseString(char[] s) {
        int j =  s.length - 1;
        for (int i = 0; i < j; i++) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j--;
        }
        return false;
    }

}
