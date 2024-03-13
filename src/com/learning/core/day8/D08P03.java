package com.learning.core.day8;

import java.util.Scanner;

public class D08P03 {
	

	    private int[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public D08P03(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = -1;
	        rear = -1;
	        size = 0;
	    }

	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full, cannot enqueue " + item);
	            return;
	        }
	        if (isEmpty())
	            front = 0;
	        rear = (rear + 1) % capacity;
	        queue[rear] = item;
	        size++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty, cannot dequeue");
	            return -1;
	        }
	        int item = queue[front];
	        if (front == rear) {
	            front = -1;
	            rear = -1;
	        } else {
	            front = (front + 1) % capacity;
	        }
	        size--;
	        return item;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty, cannot peek");
	            return -1;
	        }
	        return queue[front];
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Elements in circular queue: ");
	        int count = 0;
	        int index = front;
	        while (count < size) {
	            System.out.print(queue[index] + " ");
	            index = (index + 1) % capacity;
	            count++;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the capacity of the circular queue: ");
	        int capacity = scanner.nextInt();
	        D08P03 queue = new D08P03(capacity);

	        System.out.print("Enter the number of elements to enqueue: ");
	        int numElements = scanner.nextInt();
	        System.out.println("Enter elements:");

	        for (int i = 0; i < numElements; i++) {
	            int item = scanner.nextInt();
	            queue.enqueue(item);
	        }

	        System.out.println("Elements in circular queue:");
	        queue.display();

	        System.out.println("After removing first element:");
	        queue.dequeue();
	        queue.display();

	        scanner.close();
	    }
	}


