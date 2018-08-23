import java.io.File;
import java.io.FileNotFoundException; 
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book>list = new ArrayList<Book>();
		
		addInfo(list);
		
		List<File> list1 = new ArrayList<File>();
		
		addInfo1(list1);
	
		
		List<File> list2 = new ArrayList<>();
		
		addInfo2(list2);
	}
	
	public static void addInfo(List<Book> books) {
		books.add(new Book());
	}
	
	public static void addInfo1(List<? extends File> books) {
		// Supports hierarchy
		books.get(0);
		books.add(new Book());
	}
	public static void addInfo2(List<? super FileNotFoundException> books) {
		// TODO Auto-generated method stub
		books.add(new Book());
	}
}
