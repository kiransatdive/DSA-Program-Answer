package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void pushatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);

    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {

            return;

        }

        int top = s.pop();
        reverseStack(s);
        pushatBottom(s, top);
        

    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        printStack(s);
        reverseStack(s);
        printStack(s);


    }
}
