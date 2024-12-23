package collection;

import java.util.*;


public class Collection2 {

	public static void main(String[] args) {
		// set Interface 
		
		//unorder unique element
		
		Set<Integer> s = new HashSet<>();
		s.add(17);
		s.add(10);
		s.add(28);
		s.add(50);
		s.add(10);
		
		 System.out.println(s);
		System.out.println(s.contains(10)); 
		
		s.clear();
		
		s.add(100);
		s.add(200);
		s.add(400);
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
		s.remove(200);
		System.out.println(s.size());
	
		
		
		

	}

}
