import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<Book>> m = new HashMap<>();
		List<Book> goodOnes = new ArrayList<>();
		
		goodOnes.add(new Book(1, "abc", "cdf", 123));
		goodOnes.add(new Book(2,"lkj","poi",341d));
		goodOnes.add(new Book(3, " qwe","asd",145));
		
		List<Book> confusedAtmas = new ArrayList<>();
		confusedAtmas.add( new Book());
		confusedAtmas.add( new Book(1,"Harry Potter","J.K.Rowling", 500d));
		confusedAtmas.add( new Book(2,"The White Tiger","Arvind Adiga",300d));
		
		//System.out.println(m);
		List<Book> java = new ArrayList<>();
		java.add(new Book());
		java.add(new Book(123, "Adv Java", "Oracle", 1234d));
		java.add(new Book(300, "Adv Java", "Oracle", 2000d));		
		java.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
		m.put("random", goodOnes);
		m.put("stories", confusedAtmas);
		m.put("java", java);
		Set<Entry<String, List<Book>>> entries = m.entrySet();
		
		Iterator<Entry<String, List<Book>>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Entry<String, List<Book>> entry = iterator.next();
			System.out.println("**Book Cat: "+entry.getKey()+"**");
			List<Book> books = entry.getValue();
			for(Book book:books) {
				System.out.println(book.getName()+"-->"+book.getPrice());
			}
		}
	}

}
