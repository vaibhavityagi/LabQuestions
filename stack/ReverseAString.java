package college.stack;

import java.util.*;

public class ReverseAString {

    public static void reverse(String str) {

        Stack<Character> stk = new Stack<>();

        int idx = 0;
        while (idx < str.length()) {
            stk.push(str.charAt(idx));
        }

        StringBuilder ans = new StringBuilder();

        while (!stk.isEmpty()) {
            char ch = stk.pop();
            ans.append(ch);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        reverse("imastring");

    }

}
