package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDAOImpl b = new BookDAOImpl();
		

		
		Scanner s = new Scanner(System.in);
		while(1==1) {	
			System.out.println("Select the function you want to perform");
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Display all Books");
			System.out.println("4.Find books by name");
			System.out.println("5.Find books by author");
			System.out.println("6.Find book by ISBN");
			int i = s.nextInt();
			
			switch (i) {
			case 1:
				System.out.println("Name pls!");
				String name = s.next();
				System.out.println("Author!");
				String author = s.next();
				System.out.println("Publisher pls!");
				String publication = s.next();	
				System.out.println("ID pls!");
				String isbn = s.next();
				if(b.addBook(new Book(isbn, name, author, publication)))
					System.out.println("Roger that");
				else
					System.out.println("Mission failed");
				break;
	
			case 2:
				System.out.println("Id of book you wanna update");
				String id = s.next();			
				System.out.println("Name pls!");
				String name1	 = s.next();
				System.out.println("Author!");
				String author1 = s.next();
				System.out.println("Publisher pls!");
				String publication1 = s.next();
				
				int x = b.updateBook(new Book(id,name1,publication1,author1), id);
				if(x > 0)
					System.out.println("Roger that");
				else
					System.out.println("Mission failed");
				break;		
			case 3:
				System.out.println(b.findAllBooks());
				break;
			case 4:
				List<Book> boos = new ArrayList<>();
				System.out.println("Name of book you need!");
				String name2 = s.next();
				boos = b.findBooksbyName(name2);
				break;
			case 5:
				List<Book> boos1 = new ArrayList<>();
				System.out.println("Name of your fav. author!");
				String auth2 = s.next();
				boos = b.findBooksByAuthor(auth2);
				System.out.println(boos);
				break;
			case 6:
				Book boos2 = new Book();
				System.out.println("Id bro!");
				String idd = s.next();
				boos2 = b.findBookByISBN(idd);
				break;
				
				
			}
			System.out.println("Do you wanna continue y Or n");
			String sf = s.next();
			if(sf.equals("n"))
				break;
				
		}
	}

}
