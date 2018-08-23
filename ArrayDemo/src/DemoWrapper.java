
public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj = new Integer("143");
		int value = obj.intValue();
		
		System.out.println(obj);
		System.out.println(value);
		
		int data = obj;
		System.out.println(data);
		obj = 200;
		System.out.println(obj);
		

	}

}
