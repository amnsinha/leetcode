package leetcode.array;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ValidParenthesis {

    public static boolean isValid(String ss) {
        return isValidParentheses(ss);
    }

    public static void main(String[] args) {
        String ss = "()[]{}";
        System.out.println(isValid(ss));

        System.out.println(isValidParentheses(ss));

    }

    private static boolean isValidParentheses(String sss) {
        AtomicBoolean b = new AtomicBoolean(false);
        if (sss.length() == 0) {
            b.set(true);
            return b.get();
        }
        StringBuilder ss = new StringBuilder(sss);


        LinkedHashMap hm = new LinkedHashMap();
        int countforonebreacket = 0;
        int countforcurlybracket = 0;
        int countforbigbracket = 0;
        for (int i = 0; i < ss.length(); i++) {
            if ((ss.charAt(i) + "").equals("(")) {
                countforonebreacket = countforonebreacket + 1;
                hm.put(ss.charAt(i) + "", countforonebreacket);
            }
            if ((ss.charAt(i) + "").equals("[")) {
                countforcurlybracket = countforcurlybracket + 1;
                hm.put(ss.charAt(i) + "", countforcurlybracket);
            }
            if ((ss.charAt(i) + "").equals("{")) {
                countforbigbracket = countforbigbracket + 1;
                hm.put(ss.charAt(i) + "", countforbigbracket);
            }
            if ((ss.charAt(i) + "").equals(")")) {

                if ((ss.charAt(i - 1) + "").equals("(")) ;
                {
                    ss.deleteCharAt(i);
                    ss.deleteCharAt(i - 1);
                    if (ss.length() == 0) {
                        b.set(true);
                        return b.get();
                    }

                }
            }
            if ((ss.charAt(i) + "").equals("}")) {

                if ((ss.charAt(i - 1) + "").equals("{")) ;
                {
                    ss.deleteCharAt(i);
                    ss.deleteCharAt(i - 1);
                    if (ss.length() == 0) {
                        b.set(true);
                        return b.get();
                    }

                }

            }
            if ((ss.charAt(i) + "").equals("]")) {
                if ((ss.charAt(i - 1) + "").equals("[")) ;
                {
                    ss.deleteCharAt(i);
                    ss.deleteCharAt(i - 1);
                    if (ss.length() == 0) {
                        b.set(true);
                        return b.get();
                    }

                }
            }
        }
        isValidParentheses(ss.toString());
        return b.get();


    }
}
