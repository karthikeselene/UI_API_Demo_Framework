package junit.practice;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderTest {
	
	@Test
	public void a() {
		System.out.println("a() Test Method");
	}
	
	@Test
	public void b() {
		System.out.println("b() Test Method");
	}
	
	@Test
	public void c() {
		System.out.println("c() Test Method");
	}	
	

}
