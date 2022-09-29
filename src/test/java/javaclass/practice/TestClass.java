package javaclass.practice;

public class TestClass {

	public static void main(String[] args) {
		Animals animals = new Animals();
		Cats cats = new Cats();
		Encapsulation e = new Encapsulation();
		
		
		
		animals.run();
		cats.run();
		cats.sleep();
		
		cats.bread = "Male";
		cats.color = "Black";
		cats.name = "Kitty";
		
		
	}

}
