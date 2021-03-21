package com.java8feature.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceMain {
	
	/*
	public List<Book> getBookinSort(){
	List<Book> books = new BookDAO().getBooks();
	Collections.sort(books, new MyComparator());
	return books;
	}
	*/
	public List<Book> getBookinSort(){
	List<Book> books = new BookDAO().getBooks();
	Collections.sort(books, (o1, o2)-> o1.getName().compareTo(o2.getName()));
	return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookServiceMain().getBookinSort());
	}

}

/*
class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
*/