package com.fis.Training;

public class Book {
	
	String title;
	String author;
	float price;
	
	Book(String title, String author,float price)
	{
		
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void display_book() {
		
		System.out.println("title is "+title);
		System.out.println("author is "+author);
		System.out.println("price is "+price);
	}

}
