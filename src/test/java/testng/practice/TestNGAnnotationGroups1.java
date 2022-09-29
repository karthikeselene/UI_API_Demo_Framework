package testng.practice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(groups = "e2e")
public class TestNGAnnotationGroups1 {
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("Running beforeSuite() method.....");
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		System.out.println("Running afterSuite() method.....");
	}
	
	@BeforeGroups(groups = "smoke")
	public void beforeGroups() {
		System.out.println("Running beforeGroup() method for smoke test.....");		
	}
	
	@AfterGroups(groups = "smoke")
	public void afterGroups() {
		System.out.println("Running afterGroup() method for smoke test.....");	
	}
	
	@BeforeMethod(onlyForGroups = "smoke", groups = "smoke")
	public void beforeMethod() {
		System.out.println("Running beforeMethod()....");
	}
	
	@AfterMethod(onlyForGroups = "smoke", groups = "smoke")
	public void afterMethod() {
		System.out.println("Running afterMethod()....");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void a() {
		System.out.println("Running Smoke testing test cases....");		
	}
	
	@Test(groups = "functional")
	public void b() {
		System.out.println("Running Funtioncal testing test cases....");
	}
	
	@Test(groups = "smoke")
	public void c() {
		System.out.println("Running Smoke testing test cases....");
	}
	
	@Test(groups = {"functional", "regression"})
	public void d() {
		System.out.println("Running Functional testing test cases....");
	}
	
	@Test(groups = "regression")
	public void e() {
		System.out.println("Runnig Regression testing test cases....");
	}
	
	@Test(dependsOnGroups = "e2e" )
	public void f() {
		System.out.println("This method depends on the somke group....");
	}
	

}