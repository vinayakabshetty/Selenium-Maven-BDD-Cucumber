package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		int[] int_arr = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(int_arr));

		ArrayList<Integer> al = new ArrayList<>();
		for (int i : int_arr) {
			al.add(i);
		}
		System.out.println(al);

		// Integer objects array
		Integer[] integers = { 1, 2, 3, 4 };

		// printing input elements for comparison
		System.out.println("Array input: " + Arrays.toString(integers));

		// converting array into Collection with asList() function
		List<Integer> integerList = Arrays.asList(integers);

		// print converted elements
		System.out.println("Converted elements: " + integerList);
	}
}