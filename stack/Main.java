package college.stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Stack using collection
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println("Stack top: " + stk.peek());

        stk.pop();

        System.out.println("Stack top: " + stk.peek());

        // cutom stack
        CustomStack customStk = new CustomStack();

        customStk.push(1);
        customStk.push(2);
        customStk.push(3);

        customStk.display();

        System.out.println("Top of the stack: " + customStk.peek());

        System.out.println("Popped value: " + customStk.pop());
        System.out.println("Popped value: " + customStk.pop());
        customStk.display();
    }
}
