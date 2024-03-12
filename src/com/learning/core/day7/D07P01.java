package com.learning.core.day7;

public class D07P01 {
    private static final int MAX_SIZE = 10;
    private String[] stackArray;
    private int top;

    public D07P01() {
        stackArray = new String[MAX_SIZE];
        top = -1;
    }

    public void push(String element) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = element;
        } else {
            System.out.println("Stack overflow! Cannot push: " + element);
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow! Cannot pop.");
            return null;
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D07P01 stack = new D07P01();

        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");

        System.out.print("After Pushing 4 Elements: ");
        stack.display();

        String poppedElement = stack.pop();
        System.out.print("After a Pop: ");
        stack.display();
    }
}
