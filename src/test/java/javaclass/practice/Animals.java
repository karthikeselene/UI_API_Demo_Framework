package javaclass.practice;

public class Animals implements DesignAnimal {
	
	public String name;
	public String bread;
	public String color;
	protected String eyeColor;
	
	public void run() {
		System.out.println("Animal is running...");
	}
	
	public void sleep() {
		System.out.println("Animal is slepping...");
	}
	
	public void sound() {
		System.out.println("Animal's sound...");
	}
	
	
	

}