
public class DemoBlock {
	public DemoBlock() {
		System.out.println("constructor invoked");
	}
	{
		System.out.println("non ststic block invoked");
		
	}
	
	static {
		System.out.println("Static block invoked");
	}
	public void display() {
		System.out.println("display invoked");
	}
	public static void show() {
		System.out.println("Static show function invoked");
		
	}
	public static void main(String[] args) {
		DemoBlock.show();
		DemoBlock d = new DemoBlock();
		d.display();
	}

}
