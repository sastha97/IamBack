import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSerialization {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			FileInputStream fi = new FileInputStream("student2.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj = oi.readObject();
			Student stu = (Student)obj;
			System.out.println(stu.getName()+"\t"+stu.getTotal());
			Object obj1 = oi.readObject();

			Student stu1 = (Student)obj1;
			System.out.println(stu1.getName()+"\t"+stu1.getTotal());
			
			
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
}
