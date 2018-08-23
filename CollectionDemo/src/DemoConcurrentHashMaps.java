import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("A", "India");
		map.put("B", "Shri Lanka");
		map.put("CV", "Germany");
		map.put("z","Usa");
		
		Set<Entry<String, String>> entries = map.entrySet();
		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry =
					(Map.Entry<String, String>) it.next();
			if(entry.getKey().equals("A"));
			map.put("X", "New Country");
		}
		System.out.println(map);

	}

}
