package college.stack;

import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        pushAtBottom(stack, 0);

        System.out.println("Stack after pushing 0 at the bottom: " + stack);
    }
}