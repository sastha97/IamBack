
public class Person {
	private int age;
	private String name;
	
	public void display() {
		System.out.println("name:-"+name+"\t" + "age:-"+age);
	}
	
	public Person() {
		age=21;
		name="Sastha";
	}
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	//public void Person(String name, int age)
	
	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	
}
