package javaPrograms;

import java.util.LinkedHashSet;

/*
 * Synechron Technologies - Round 1
 * Remove duplicates from String
 * Use only one for loop
 * Maintain insertion order - Use of linkedHashSet, Tree set is for sorting of elements
 * 10 mins
 */

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "Abrakadabra";
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		System.out.println(hs);
	}

}