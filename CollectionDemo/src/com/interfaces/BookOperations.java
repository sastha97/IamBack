package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public interface BookOperations{
	public List<Book> books = new ArrayList();
	public int addBook(Book book) ;
	public boolean deleteBook(Book book);
	public Book findBookById(Book book) ;
	public List<Book> findBooksByName(String bookName);

}
