import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  l = new ArrayList();
		l.add("Sastha");
		l.add("PVR");
		l.add("SRK");
		l.add("Happy");
		//l.add((Integer)(5));
		
		Person s = new Person();
		Person t = new Person(100, "Centurian");

		List m = new ArrayList();
		m.add(l);
		m.add(s);
		m.add("Monkey");
		m.add("Monkey");
		m.add(2, t);
		m.add(2,2);
		System.out.println(l+" Size:"+l.size());
		System.out.println(m+" Size:"+m.size());
		
		if(l.contains(5)) System.out.println("true");
		
		Object o = m.get(1);
		System.out.println(o);
		
		if(m.remove("Monkey")) System.out.println("Bye Bye Monkey");
		else System.out.println("Didn't go");
		
		System.out.println(m);
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}

}
