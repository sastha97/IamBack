
public class DemoStatic {
	private float age;
	private String name;
	
	private static int value;
	
	public DemoStatic() {
		// TODO Auto-generated constructor stubn`N
	age = 12.12f;
	name = "abcd";
	value++;
	}
	static {
		value = 10;
	}
	public void display() {
		System.out.println(name+"-"+age+"-"+value);
	}

	public static void show() {
		System.out.println(value);
	}
	public static void main(String[] args) {
		DemoStatic.show();
		DemoStatic d1 = new DemoStatic();
		DemoStatic d2 = new DemoStatic();
		DemoStatic d3 = new DemoStatic();
		DemoStatic d4 = new DemoStatic();
		d2.show();
		d2.display();
	}

}
