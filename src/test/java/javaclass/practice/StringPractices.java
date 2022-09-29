package javaclass.practice;

public class StringPractices {

	public static void main(String[] args) {

		String a = "Karthikeyan";
		String b = "Karthikeyan lives in Chennai";
		String c = " Karthikeyan ";

		System.out.println(a.equals("KARTHIKEYAN"));
		System.out.println(a.equalsIgnoreCase("KARTHIKEYAN"));
		System.out.println(b.contains("Chennai"));

		char[] charArray = a.toCharArray();
		for (char ch : charArray) {
			System.out.println(ch);
		}
		System.out.println(a.charAt(5));
		System.out.println(a.length());

		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(c.trim());
		String[] split = b.split(" ");
		System.out.println(split[0]);
		for (String string : split) {
			System.out.println(string);
		}
		String[] split2 = b.split(" ", 2);
		System.out.println(split2.length);
		for (String string : split2) {
			System.out.println(string);
		}

		System.out.println(a.indexOf('K'));
		System.out.println(a.replace('a', 'A'));

	}

}
