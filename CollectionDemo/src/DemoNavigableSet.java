import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<String> set = new TreeSet<>();
		
	set.add("India");
	set.add("Indonesia");
	set.add("Germany");
	set.add("USA");
	System.out.println(set);
	
	System.out.println(set.headSet("India", true));
	System.out.println(set.tailSet("India", true));

	}

}
