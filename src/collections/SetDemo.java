package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("hey");
		s1.add("hello");
		s1.add("hey");
		s1.add(null);
		s1.add("world");
		s1.add(null);
		
		System.out.println("Hash set s1 : "+s1);
		
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("hey");
		s2.add("hello");
		s2.add("hey");
		s2.add(null);
		s2.add("world");
		s2.add(null);
		
		System.out.println("LinkedHashSet s2 : "+s2);
		
		Set<String> s3 = new TreeSet<>(Collections.reverseOrder());
		s3.add("hey");
		s3.add("hello");
		s3.add("hey");
		//s3.add(null);
		s3.add("world");
		//s3.add(null);
		
		//System.out.println("TreeSet s3 : "+s3);
		
		System.out.println("TreeSet s3 in reverse order : "+s3);
		
		for(String s:s3) {
			System.out.println("Printing using for each as for uses index : "+s.toUpperCase());
		}
		
		s3.remove("hey");
		System.out.println("remove obj : "+s3);
		
		System.out.println("contains usage : "+s3.contains("hey"));
		
		System.out.println("Iterating using Iterator");
		Iterator<String> i = s3.iterator();
		while(i.hasNext()) {
			String temp =  i.next();
			System.out.println(temp.toUpperCase());
		}
				
	}

}
