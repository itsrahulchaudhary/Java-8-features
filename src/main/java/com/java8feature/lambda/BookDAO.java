package com.java8feature.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks(){
		List<Book> list = new ArrayList<>();
		list.add(new Book(101, "Java", 150));
		list.add(new Book(105, "Spring", 450));
		list.add(new Book(108, "Python", 350));
		return list;
		
	}
}
