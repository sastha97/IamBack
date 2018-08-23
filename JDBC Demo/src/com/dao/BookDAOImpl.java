package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connections.MyConnection;



public class BookDAOImpl implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String INSERT_Book = "insert into Book values(?,?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_Book);
			
			ps.setString(1, book.getISBN());
			
			ps.setString(2, book.getName());
			
			ps.setString(3, book.getPublication());
			
			ps.setString(4, book.getAuthor());
			r = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(r==0) return true;
		
		return false;
	}

	@Override
	public int updateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		Book emp = new Book();
		int rows = 0;
		
		String UPDATE_BOOK = "update Emp1 set salary = ? where ISBN = ?";
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			ps.setString(1, book.getISBN());
			
			ps.setString(2, book.getName());
			
			ps.setString(3, book.getPublication());
			
			ps.setString(4, book.getAuthor());
			
			rows  = ps.executeUpdate();
			if(rows > 0) {
				emp = findBookByISBN(ISBN);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public int deleteBook(String Isbn) {
		// TODO Auto-generated method stub

		String FIND_BY_ID = "Delete from BOOK where ISBN = ?";
		int rows = 0;
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BY_ID);
			ps.setString(1, Isbn);
			
			rows = ps.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		Book book = new Book();
		
		String FIND_BY_ID = "select * from BOOK where ISBN = ?";
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BY_ID);
			ps.setString(1, ISBN);
			
			ResultSet set  = ps.executeQuery();
			while(set.next()) {
				book = new Book(set.getString("ISBN"),set.getString("name"),set.getString("publication"),set.getString("author"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
		
	
	}

	@Override
	public List<Book> findBooksbyName(String name) {
		// TODO Auto-generated method stub
		Book book = new Book();
		List<Book> books = new ArrayList<>();
		
		String FIND_BY_ID = "select * from BOOK where name = ?";
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BY_ID);
			ps.setString(1, name);
			
			ResultSet set  = ps.executeQuery();
			while(set.next()) {
				book = new Book(set.getString("ISBN"),set.getString("name"),set.getString("publication"),set.getString("author"));
				books.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
		
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		Connection con = MyConnection.getMyConnection();

		String FIND_ALL_BookS = "select * from Book";
		
		try {
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(FIND_ALL_BookS);
			while(set.next()) {
				String ISBN = set.getString(1); 
				String name = set.getString(2);
				String publication = set.getString(3);
				String author = set.getString(4);
				Book book = new Book(ISBN, name, publication, author);
				
				books.add(book);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;	
		
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		Book book = new Book();
		List<Book> books = new ArrayList<>();
		
		String FIND_BY_ID = "select * from BOOK where author = ?";
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_BY_ID);
			ps.setString(1, auth_name);
			
			ResultSet set  = ps.executeQuery();
			while(set.next()) {
				book = new Book(set.getString("ISBN"),set.getString("name"),set.getString("publication"),set.getString("author"));
				books.add(book);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;

	}



}
