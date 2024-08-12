package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
public class Framework_Collections_Basic {

	public static void main(String[] args) {
		        ArrayList<String> list = new ArrayList<>();
		        HashSet<String> set = new HashSet<>();
		        HashMap<String, String> map = new HashMap<>();
		        LinkedList<String> queue = new LinkedList<>();
		        
		        // Usage example
		        list.add("item1");
		        set.add("item2");
		        map.put("key1", "value1");
		        queue.add("item3");
		        
		        System.out.println("List: " + list);
		        System.out.println("Set: " + set);
		        System.out.println("Map: " + map);
		        System.out.println("Queue: " + queue);
 }
}