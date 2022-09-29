package javaclass.practice;

public class MethodOverLoading {
	
	public void name() {
		System.out.println("Java");
	}
	
	public void name(String name) {
		System.out.println(name);
	}
	
	public void name(int old) {
		System.out.println(old);
	}
	
	public void name(String old, String name) {
		System.out.println(old+" - "+name);
	}
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.name();
		obj.name(10);
		obj.name("Karthikeyan");
		obj.name("Karthikeyan", "Rajendran");
	}

}
