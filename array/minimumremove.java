package leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class minimumremove {

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("L(e)))et((co)d(e"));
    }

    public static String minRemoveToMakeValid(String s) {

        Set<Integer> indexesToRemove = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }

            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexesToRemove.add(i);
                } else {
                    stack.pop();
                }
            }


        }


        StringBuilder ss = new StringBuilder();
        while (!stack.isEmpty()) indexesToRemove.add(stack.pop());

        for (int i = 0; i < s.length(); i++) {
            if (indexesToRemove.contains(i)) {

            } else {
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();


    }
}
