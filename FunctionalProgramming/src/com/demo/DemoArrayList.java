package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		
		l.add("ABC");
		l.add("XYZ");
		l.add("c");
		l.add("LMN");
		l.add("ABC");
		
		System.out.println(l);
		
		l.forEach(System.out::println);
		
		System.out.println("Testing");
		
		l.stream().filter(data->{return data.length() >= 3;}).collect(Collectors.toList()).forEach(System.out::println);
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));		
		books.add(new Book(12, "Adv Java", "Oracle", 1300d));
		System.out.println("No. of books:" + books.size());
		
		System.out.println("Books Testing");
		
		books.stream().filter(data->{return data.getPrice() <= 1500d && data.getName().startsWith("A") && data.getPublication().equals("Oracle") ;}).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
