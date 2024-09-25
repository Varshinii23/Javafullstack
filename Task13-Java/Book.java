package com.index;

public class Book {
	String title;
	String author;
	int price;

	public Book(){
		
	}
	public Book(String t,String a) {
		title=t;
		author=a;
	}
	public Book(String t,String a,int p) {
		title=t;
		author=a;
		price=p;
	}
	
	void display() {
		System.out.println("Book Title:"+ title);
		System.out.println("Book author:"+ author);
		System.out.println("Book price:"+ price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book();
		Book b2=new Book("It Starts With Us","Colleen Hoover");
		Book b3=new Book("It Starts With Us","Colleen Hoover",275);
		b1.display();
		b2.display();
		b3.display();

	}

}
