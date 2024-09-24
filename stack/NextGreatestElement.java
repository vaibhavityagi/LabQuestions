package college.stack;

import java.util.Stack;

public class NextGreatestElement {
    public static void findNextGreatest(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        findNextGreatest(arr);
    }
}
