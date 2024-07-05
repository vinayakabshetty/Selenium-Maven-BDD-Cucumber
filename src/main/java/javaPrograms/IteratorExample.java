package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		
		Iterator itr = al.iterator();
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());

	}

}
