package week04;

import java.util.Scanner;

/*
    배열로 스택만들기
 */
public class Ex26 {
    public static void main(String[] args) {
        // 1. push, 2. peel, 3. pop, 4. clear, 5.print, 0.exit
        ArrayStack stack = new ArrayStack(5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(String.format("%d / %d", stack.size(), stack.capacity()));
            System.out.print("1. push, 2. peek, 3. pop, 4. clear, 5. print, 0. exit : ");
            int n = sc.nextInt();
            if(n==0) break; // 0. exit

            switch (n){
                case 1:
                    System.out.print("push : ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    System.out.print("peek : " + (int)stack.peek() + "\n");
                    break;
                case 3:
                    System.out.print("pop : " + (int)stack.pop() + "\n");;
                    break;
                case 4:
                    System.out.print("clear : ");
                    stack.clear();
                    break;
                case 5:
                    stack.print();
                    break;
                default:
                    System.out.println("숫자를 잘못 입력");
                    break;
            }

        }
    }
}

class ArrayStack {
    private Object stack[];
    private int top;
    private int max;

    public ArrayStack(int max) {
        this.max = max;
        this.top = 0;
        stack = new Object[max];
    }

    public void push(Object obj){
        if(top > max - 1){
            System.out.println("Stack is full!!!");
        }else {
            stack[top++] = obj;
        }
    }

    public Object peek(){
        if(top <= 0){
            System.out.println("Stack is empty!!");
            return null;
        }
        return stack[top - 1];
    }

    public Object pop(){
        if(top <= 0){
            System.out.println("Stack is empty!!");
            return null;
        } else{
            Object obj = stack[top - 1];
            stack[top - 1] = null;
            top--;
            return obj;
        }
    }

    public void clear(){
        this.top = 0;
        stack = new Object[this.max];

    }

    public void print(){
        for(Object obj : stack){
            if(obj != null) {
                System.out.println(String.format("%s ", obj.toString()));
            }
        }
        System.out.println();
    }

    public int size() {
        return this.top;
    }

    public int capacity() {
        return this.max;
    }
}