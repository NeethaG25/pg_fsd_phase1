package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Helllo");
		m1.put(1, "Hello");
		m1.put(2, "World");
		m1.put(3, "World");
		m1.put(1, "Hello");
		m1.put(4, null);
		m1.put(5, null);
		m1.put(null, "Java");
		m1.put(null, null);
		
		System.out.println("Hash Map : "+m1);
		
		Map<Integer, String> m2 = new LinkedHashMap<>();
		m2.put(1, "Helllo");
		m2.put(1, "Hello");
		m2.put(2, "World");
		m2.put(3, "World");
		m2.put(1, "Hello");
		m2.put(4, null);
		m2.put(5, null);
		m2.put(null, "Java");
		m2.put(null, null);
		
		System.out.println("LinkedHashMap : "+m2);
		
		Map<Integer, String> m3 = new TreeMap<>();
		m3.put(1, "Helllo");
		m3.put(1, "Hello");
		m3.put(2, "World");
		m3.put(3, "World");
		m3.put(1, "Hello");
		m3.put(4, null);
		m3.put(5, null);
		//m3.put(null, "Java");
		//m3.put(null, null);
		
		System.out.println("LinkedHashMap : "+m3);
		
		Map<Integer, String> m4 = new Hashtable<>();
		m4.put(100, "Helllo");
		m4.put(1, "Hello");
		m4.put(200, "World");
		m4.put(3, "World");
		m4.put(1, "Hello");
		//m4.put(4, null);
		//m4.put(5, null);
		//m3.put(null, "Java");
		//m3.put(null, null);
		
		System.out.println("LinkedHashMap : "+m4);
		
		System.out.println("Size : "+m4.size());
		
		System.out.println("get or read : "+m4.get(1));
		System.out.println("get when value is not there returns null : "+m4.get(5));
		
		System.out.println("remove : "+m4.remove(1));
		System.out.println("remove key that is not present : "+m4.remove(1));
		
		System.out.println("contains key : "+m4.containsKey(2));
		System.out.println("contains key : "+m4.containsKey(1));
		
		System.out.println("Contains Value : "+m4.containsValue("World"));
		System.out.println("Contains Value : "+m4.containsValue("Hey"));
		
		System.out.println("Key Set : "+m4.keySet());
		System.out.println("Value Set : "+m4.values());
		
		Set<Integer> s1 = m4.keySet();
		for(Integer i:s1) {
			System.out.println("For for keys : "+m4.get(i));
		}
		
		for (Entry<Integer, String> e:m4.entrySet()) {
			System.out.println("Using Entry : "+e.getKey());
		}
		
		Iterator<Entry<Integer, String>> i = m4.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String> e = i.next();
			if(e.getKey()%10==0 || e.getKey()==null) {
				i.remove();
			}
		}
		System.out.println("Iterator to solve the concurrency problem : "+m4);

	}

}
