package com.book;

import java.util.ArrayList;

public class BookStore {
	// Creating array list 
		private ArrayList<Book> bookColl = new ArrayList<>();

		//method to add books to the array list
		public void addBook(Book b) {
				bookColl.add(b);
		}
		// method to search books by title
		public void searchByTitle(String title) {
			if(bookColl.stream().anyMatch(b->{return title.equalsIgnoreCase(b.getTitle());})) {
				System.out.println(bookColl);
			} else {
				System.out.println("Title not found!");
			}
		 }
		
			// method to search books by the name of author
			public void searchByAuthor(String author) {
				if(bookColl.stream().anyMatch(b->{return author.equalsIgnoreCase(b.getAuthor());})) {
					System.out.println(bookColl);
				} else {
					System.out.println("Author not found!");
				}	
			}
			
			// method to print all book details
			public void displayAll() {
				for(Book b : bookColl) {
					System.out.println("Book-Id:- " + b.getBookId() + " Title:- " + b.getTitle() + " Author:- " + b.getAuthor()
					+ " Category:- " + b.getCategory() + " Price:- " + b.getPrice());
				}

			}
		
}
