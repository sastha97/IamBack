import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public class DemoDerialization {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Scanner s = new Scanner(System.in);
		System.out.println("Name");
		student1.setName(s.next());
		System.out.println("RollNo");
		student1.setRollNo(s.nextInt());
		System.out.println("Total");
		student1.setTotal(s.nextInt());
		
		System.out.println("Name");
		student2.setName(s.next());
		System.out.println("RollNo");
		student2.setRollNo(s.nextInt());
		System.out.println("Total");
		student2.setTotal(s.nextInt());
		
		try {
			File f = new File("books.txt");
			if(!f.exists())  
			FileOutputStream fo = new FileOutputStream("books.txt", true);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(student1);
			oo.writeObject(student2);

			oo.close();
			fo.close();
			/*FileOutputStream fo1 = new FileOutputStream("student1.txt", true);
			ObjectOutputStream oo1 = new ObjectOutputStream(fo);
			oo1.writeObject(student2);
			oo1.close();
			fo1.close();*/
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
