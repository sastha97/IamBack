package com.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;

public class BookOperationsImpl implements BookOperations{
	public int addBook(Book book) {
//		if(books.add(book)) return 1;
//		else return 0;
		File f = new File("Books.txt");
		if(f.exists()) {
			try {
				FileInputStream fi = new FileInputStream("Books.txt");
				ObjectInputStream oi = new ObjectInputStream(fi);
				Object obj = oi.readObject();
				List<Book> boo= (List<Book>)obj;
				if(boo.size()!=0) {
						Iterator<Book> it = boo.iterator();
						while(it.hasNext()) {
							Book dum = it.next();
							books.add(dum);
						}
				}
	
			
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		books.add(book);
		
		try {
			FileOutputStream fo = new FileOutputStream("Books.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(books);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		

		
	}
	public boolean deleteBook(Book book) {
		if(books.remove(book)) return true;
		else return false;
	}
	public Book findBookById(Book book) {
		int id = book.getIsbn();
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getIsbn() == id ) return data;
		}
		Book boo = null;
		return boo;
		
	}
	public List<Book> findBooksByName(String bookName){
		List<Book> newBooks = new ArrayList<>();
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getName().equals(bookName)) newBooks.add(data);
			
		}
		
		return newBooks;
	}

}
