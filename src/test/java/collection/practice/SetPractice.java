package collection.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Mango");
		set.add("Apple");
		set.add("Orange");
		set.add(null);
		set.add("Mango");
		System.out.println(set.toString());
		System.out.println(set.size());
		//System.out.println(set.get(4));
		for (String string : set) {
			System.out.println(string);
		}
		//		set.set(3, "Watermelon");
		//		System.out.println(set.toString());
		//		for (String string : set) {
		//			System.out.println(string);
		//		}
		System.out.println(set.remove(null));
		System.out.println(set.remove(4));
		System.out.println(set.toString());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.size());
	}

}
