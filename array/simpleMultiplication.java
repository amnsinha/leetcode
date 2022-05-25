package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class simpleMultiplication {
    public static void main(String[] args) {


        String num1 = "87";
        String num2 =  "6";
        List s = new ArrayList<>();
        int carry = 0;
        int count = 0;
        int len_a = num1.length(), len_b = num2.length();

        while (len_a != 0 || len_b != 0) {
            int x = 0, y = 0;
            if (len_a > 0) {
                x = num1.charAt(len_a - 1) - '0';
                len_a--;
            }
            if (len_b > 0) {
                y = num2.charAt(len_b - 1) - '0';
                len_b--;
            }

            int sum = x * y + carry;

            int ones = sum / 10;
            carry = sum % 10;
            s.add(carry);
            System.out.println(carry);
        }
    }
}
