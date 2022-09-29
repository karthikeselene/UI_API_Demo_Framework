package epam.practice;

import java.util.LinkedHashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 3, 6, 6};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int integer : arr) {
			if(!set.add(integer)) {
				System.out.print(integer+" ");
			}
		}
	}

}
