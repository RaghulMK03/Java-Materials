package collection;
import java.util.*;

public class Collection3 {

	public static void main(String[] args) {
		// Set interface
		/*set interface TreeSet
		 * is used for ordered list
		 * Drawback no index number
		 */
		
		
		Set<Integer> s = new TreeSet<>();
		s.add(17);
		s.add(10);
		s.add(50);
		s.add(28);
		s.add(10);
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
		

	}

}
