import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Salary");
		emp.setEmpSalary(s.nextDouble());
		System.out.println("Age");
		emp.setAge(s.nextInt());
		System.out.println("ID");
		emp.setEmpId(s.nextInt());
		System.out.println("Name");
		emp.setName(s.next());
		return emp;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.display(12);

	}

}
