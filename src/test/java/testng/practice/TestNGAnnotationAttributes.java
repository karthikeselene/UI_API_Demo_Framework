package testng.practice;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGAnnotationAttributes {	

	@Test(description = "TestNG Description attribute", priority = 1)
	public void description() {
		System.out.println("Running description() method");
	}

	@Test(timeOut = 2000, priority = 2)
	public void timeOut() throws InterruptedException {
		//Thread.sleep(3000);
		System.out.println("Running timeOut() method");
	}

	@Test(priority = 0)
	public void priority() {
		System.out.println("Running priority() method");
	}

	@Test(dependsOnMethods = {"timeOut", "description"})
	public void despendsOnMethod() {
		System.out.println("Running dependsOnMethod() method");		
	}

	@Test(enabled = true)
	public void enabled() {
		System.out.println("Running enabled() method");	
	}

	@Test(invocationCount = 3, threadPoolSize = 3)
	public void retry() {		
		System.out.println("Running retry() method "+Thread.currentThread().getId());
		
	}
	
	
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
	

}
