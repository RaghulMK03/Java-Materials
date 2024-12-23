package collection;

import java.util.*;

public class Collection4 {

	public static void main(String[] args) {
		// Map Interface
		
		Map<String,Integer> m = new HashMap<>();
		m.put("Kavi", 45);
		m.put("praba", 47);
		m.put("Manji", 46);
//		m.put("Raghul", 30);
		m.put("Raghul", 40);
		System.out.println(m);
		
		System.out.println(m.replace("Raghul", 40, 43));
		
		for(String key:m.keySet())
			System.out.println(key +":"+m.get(key) );

	}

}
