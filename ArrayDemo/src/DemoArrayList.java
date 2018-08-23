import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(2415));
		list.add(24);
		list.add(15);
		list.add(24);
		
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(5,143);
		
		System.out.println(list.size());
		System.out.println(list);

		list.remove(0);
		
		System.out.println(list.size());
		System.out.println(list);
		
		if(list.remove(new Integer(15)))
			System.out.println("Done");
		
		System.out.println(list.size());
		System.out.println(list);
	}

}
