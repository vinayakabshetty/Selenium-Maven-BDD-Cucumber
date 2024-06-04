package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(18);
		al.add(100);
		al.add(55);
		al.add(75);

		System.out.println("*** Original Array list ***");
		System.out.println(al);

		// Collections class 
		Collections.sort(al);
		System.out.println("*** Sorted Array list ***");
		System.out.println(al);

	}

}
