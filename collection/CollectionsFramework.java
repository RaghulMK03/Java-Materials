package collection;

import java.util.*;

public class CollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		String app = "Instagram";
//		System.out.println(app.replace('a','o'));
		
		
		List<Integer> value = new ArrayList<>();
		value.add(50);
		value.add(20);
		value.add(30);
		value.add(40);
		value.add(0,10);
		
		Collections.sort(value);
		
		System.out.println(value.size()); 
		
		
		
//		for(Object a:value)
//		{
////			int val = (int)a*2;
//			System.out.println(a*2);
//		}
//		
		
		
	}

}
