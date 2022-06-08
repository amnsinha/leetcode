package leetcode.array;

public class zigzag {


    public static void main(String[] args) {

        System.out.println(covert("PAYPALISHIRING", 3));

    }


    public static String covert(String s, int rows) {


        StringBuilder[] sbs = new StringBuilder[rows];

        for(int i = 0; i < rows; i++)
        {
            sbs[i] = new StringBuilder();
        }


        char[] arr = s.toCharArray();

 return sbs.toString();
    }
}
