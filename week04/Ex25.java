package week04;

import java.util.Stack;

/*
    Stack
 */
public class Ex25 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.add(2);
        System.out.println(stack.toString());
        stack.add(0,0);
        System.out.println(stack.toString());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.get(1));
        System.out.println(stack.pop());
        System.out.println(stack.getFirst());
        System.out.println(stack.getLast());
    }
}
