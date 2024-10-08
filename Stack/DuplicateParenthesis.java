package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isduplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;

                }
                if (count < 1) {
                    return true; // true

                } else {
                    s.pop();// opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a+b)";

        System.out.println(isduplicate(str2));

    }

}
