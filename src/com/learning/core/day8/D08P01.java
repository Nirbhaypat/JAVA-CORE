package com.learning.core.day8;

import java.util.Scanner;

public class D08P01 {

	
	    private int maxSize;
	    private int front;
	    private int rear;
	    private int[] queueArray;

	    public D08P01(int size) {
	        maxSize = size;
	        queueArray = new int[maxSize];
	        front = 0;
	        rear = -1;
	    }

	    public void enqueue(int value) {
	        if (rear == maxSize - 1) {
	            System.out.println("Error: Queue is full. Cannot add " + value);
	            return;
	        }
	        queueArray[++rear] = value;
	    }

	    public int dequeue() {
	        if (front > rear) {
	            System.out.println("Error: Queue is empty.");
	            return -1;
	        }
	        return queueArray[front++];
	    }

	    public void printQueue() {
	        if (front > rear) {
	            System.out.println("Error: Queue is empty.");
	            return;
	        }
	        System.out.print("Elements in queue: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queueArray[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the queue size: ");
	        int size = scanner.nextInt();

	        if (size <= 0) {
	            System.out.println("Error: Queue size must be a positive integer.");
	            return;
	        }

	        D08P01 queue = new D08P01(size);

	        System.out.print("Enter the number of elements to add: ");
	        int numElements = scanner.nextInt();

	        if (numElements <= 0) {
	            System.out.println("Error: Number of elements must be a positive integer.");
	            return;
	        }

	        for (int i = 0; i < numElements; i++) {
	            System.out.print("Enter element " + (i+1) + ": ");
	            int value = scanner.nextInt();

	            if (value == -1) {
	                System.out.println("Error: Element value cannot be -1.");
	                return;
	            }

	            queue.enqueue(value);
	        }

	        queue.printQueue();

	        queue.dequeue();

	        System.out.println("After removing first element: ");
	        queue.printQueue();
	    }
	}

