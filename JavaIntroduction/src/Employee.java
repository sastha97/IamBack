
public class Employee {
	private int empId;
	private double salary;
	private String empName;
	private String companyName;
	public Employee() {
		this.empId = 10;
		this.salary = 1000;
		this.empName = "King";
		this.companyName = "city ltd";
	}
	public Employee(int empId, String empName, double salary) {
		this();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
//		this.companyName = companyName;
	}
	public void display() {
		System.out.println(empName+"\t"+empId+"\t"+companyName);
		
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(1200, "emp name1", 12000d);
		emp.display();	
	}
	
	
}
