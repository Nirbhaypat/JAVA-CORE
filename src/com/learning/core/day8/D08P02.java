package com.learning.core.day8;

import java.util.Scanner;

class Node {
	    int data;
	    Node next;


	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	
	public class D08P02 {
	    private Node front;
	    private Node rear;

	   
	    public D08P02() {
	        front = null;
	        rear = null;
	    }

	   
	    public void enqueue(int value) {
	        Node newNode = new Node(value);

	       
	        if (front == null) {
	            front = newNode;
	            rear = newNode;
	        } else {
	           
	            rear.next = newNode;
	            rear = newNode;
	        }
	    }

	 
	    public int dequeue() {
	      
	        if (front == null) {
	            System.out.println("Error: Queue is empty.");
	            return -1;
	        }

	       
	        int dequeuedValue = front.data;
	       
	        front = front.next;

	       
	        if (front == null) {
	            rear = null;
	        }

	       
	        return dequeuedValue;
	    }

	  
	    public void printQueue() {
	        
	        if (front == null) {
	            System.out.println("Error: Queue is empty.");
	            return;
	        }

	        
	        System.out.print("Elements in queue: ");
	        Node current = front;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        D08P02 queue = new D08P02();

	      
	        System.out.print("Enter the number of elements to add: ");
	        int numElements = scanner.nextInt();

	      
	        for (int i = 0; i < numElements; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            int value = scanner.nextInt();
	            queue.enqueue(value);
	        }

	       
	        System.out.println("Elements in queue: ");
	        queue.printQueue();

	        
	        System.out.print("Enter the number of elements to remove: ");
	        int numElementsToRemove = scanner.nextInt();

	        
	        for (int i = 0; i < numElementsToRemove; i++) {
	            queue.dequeue();
	        }

	       
	        System.out.println("After removing " + numElementsToRemove + " elements: ");
	        queue.printQueue();

	        scanner.close();
	    }
	}



