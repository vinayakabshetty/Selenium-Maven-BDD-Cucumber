package javaPrograms;

import java.util.HashMap;

public class SortedMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("A", 10);
		hmap.put("B", 50);
		hmap.put("C", 100);
		hmap.put("D", 150);
		hmap.put("E", 75);
		hmap.put("F", 25);

		System.out.println(hmap);

		System.out.println(hmap.entrySet());
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

	}

}
