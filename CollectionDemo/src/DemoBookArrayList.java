import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));		
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		System.out.println("No. of books:" + books.size());
		System.out.println(books);
		
		Book bookToSearch = (new Book(300, "Adv Java", "Oracle", 2000d));
		if(books.contains(bookToSearch)) System.out.println("There it is!");
		else System.out.println("GetLost");

		
		
	}

}
