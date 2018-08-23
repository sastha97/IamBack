import com.pojo.Employee;

public class DemoMyClass {
	public static void main(String[] args) {
		EmployeeIO empIO = new EmployeeIO() {
@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return null;
			}			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();

			}
			@Override
			public Employee readEmployee(Employee employee) {
				// TODO Auto-generated method stub
				return new Employee();
			}
		};
		
	}

}
