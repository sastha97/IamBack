import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.Person;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s = new Scanner(System.in);
		System.out.println("Give me Salary");
		double empSalary = s.nextDouble();
		System.out.println("Ahem Ahem, ID");
		int empId = s.nextInt();
		System.out.println("");
		int age = s.nextInt();
		String name = s.next();
		Employee emp = new Employee(empSalary, empId, age, name);
		emp.display();*/
		
		Person p1 = new Person(12,"ABC");
		Person p2 = new Person(12,"ABC");
		if(p1.equals(p2)){
			System.out.println("cool");
			
		}
		else System.out.println("boom");

	}

}
