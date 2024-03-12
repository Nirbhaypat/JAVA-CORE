package com.learning.core.day1;

import java.util.Scanner;

class Book implements BookI{
    String book_title;
    String book_price;

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_price() {
        return book_price;
    }

    public void setBook_price(String book_price) {
        this.book_price = book_price;
    }

	@Override
	public void createBook(String book_title, String book_price) {
		// TODO Auto-generated method stub
		 
		        setBook_title(book_title);
		        setBook_price(book_price);
		    }
		
	

	@Override
	public void showBook() {
		// TODO Auto-generated method stub
		System.out.println("Book Title:"+getBook_title()+" and Price:"+getBook_price());
		
	}

}

public class D01P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book_title = scanner.nextLine();
        String book_price = scanner.next();
        Book book = new Book();
        book.createBook(book_title,book_price);
        book.showBook();
    }
}
