package recursion.problems;

import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }

        int topElement = stack.pop();

        sortStack(stack);

        insertInSortedOrder(stack, topElement);
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int topElement = stack.pop();
            insertInSortedOrder(stack, element);
            stack.push(topElement);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
