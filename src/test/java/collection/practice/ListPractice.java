package collection.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add(null);
		list.add("Mango");
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.get(4));
		list.set(3, "Watermelon");
		System.out.println(list.toString());
		for (String string : list) {
			System.out.println(string);
		}
		list.remove(4);
		System.out.println(list.toString());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
	}

}