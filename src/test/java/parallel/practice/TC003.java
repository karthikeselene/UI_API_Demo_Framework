package parallel.practice;

import org.testng.annotations.Test;

public class TC003 {
	
	@Test
	public void test001() {
		System.out.println("TC003 --> test001() "+Thread.currentThread().getId());
	}

	@Test
	public void test002() {
		System.out.println("TC003 --> test002() "+Thread.currentThread().getId());
	}

	@Test
	public void test003() {
		System.out.println("TC003 --> test003() "+Thread.currentThread().getId());
	}

}
