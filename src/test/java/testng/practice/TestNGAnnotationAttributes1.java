package testng.practice;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestNGAnnotationAttributes1 {
	
	int count = 0;

	@Test(invocationCount = 5, invocationTimeOut = 6000)
	public void invocationTimeOut() throws Exception {	
		System.out.println("Running retry() method "+Thread.currentThread().getId());	
		Thread.sleep(1000);
	}
	
	@Test(invocationCount = 5, invocationTimeOut = 4000)
	public void invocationTimeOut1() throws Exception {	
		System.out.println("Running retry() method "+Thread.currentThread().getId());	
		Thread.sleep(1000);
	}
	
	@Test(invocationCount = 5, invocationTimeOut = 6000, timeOut = 900)
	public void invocationTimeOut2() throws Exception {	
		System.out.println("Running retry() method "+Thread.currentThread().getId());	
		Thread.sleep(1000);
	}
	
	@Test
	public void a() {
		assertTrue(false);
	}
	
	@Test(dependsOnMethods = "a", alwaysRun = true)
	public void b() {
		System.out.println("Running b() method....");
	}
	
	@Test(invocationCount = 5, successPercentage = 80)
	public void retry1() {	
		count++;
		System.out.println("Invoked count : " + count);
		if(count%2 == 0) {
			assertTrue(false);
		} else {
			assertTrue(true);
		}				
	}
	
	@Test(invocationCount = 5, invocationTimeOut = 6000, timeOut = 900, expectedExceptions = {ThreadTimeoutException.class})
	public void invocationTimeOut3() throws Exception {	
		System.out.println("Running retry() method "+Thread.currentThread().getId());	
		Thread.sleep(1000);
	}
	
	@Test(invocationCount = 5, skipFailedInvocations = true)
	public void retry2() {	
		count++;
		System.out.println("Invoked count : " + count);
		if(count%2 == 0) {
			assertTrue(false);
		} else {
			assertTrue(true);
		}				
	}

}
