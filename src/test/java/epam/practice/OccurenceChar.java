package epam.practice;

import java.util.LinkedHashMap;

public class OccurenceChar {

	public static void main(String[] args) {

		String str = "Testingss";
		LinkedHashMap<Character, Integer> counter = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if(counter.containsKey(str.charAt(i))) {
				counter.put(str.charAt(i), counter.get(str.charAt(i)) + 1);
			} else {
				counter.put(str.charAt(i), 1);
			}
		}
		System.out.println(counter);
	}

}