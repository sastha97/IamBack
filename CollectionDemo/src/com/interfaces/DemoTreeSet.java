package com.interfaces;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books = new TreeSet();
		
	//	books.add(new Book());
		books.add(new Book(123, "Adv Jva", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
			
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
		System.out.println("No. of books:" + books.size());
		System.out.println(books);

	}

}
