package testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(groups = {"e2e"})
public class TestNGAnnotationGroups {

	@BeforeSuite(inheritGroups = true)
	public void beforeSuite() {
		System.out.println("Runnig method beforeSuite()......");
	}

	@AfterSuite(inheritGroups = true)
	public void afterSuite() {
		System.out.println("Runnig method beforeSuite()......");
	}
	
	@BeforeMethod(onlyForGroups = {"smoke"}, groups = {"smoke"})
	public void beforeMethod() {
		System.out.println("Runnig method beforeMethod()......");
	}

	@Test(groups = {"smoke"})
	public void a() {
		System.out.println("Runnig method a()......");
	}

	@Test(groups = {"regression"})
	public void b() {
		System.out.println("Runnig method b()......");
	}

	@Test(groups = {"smoke", "regression"})
	public void c() {
		System.out.println("Runnig method c()......");
	}
	
	@Test(dependsOnGroups = {"e2e"})
	public void d() {
		System.out.println("Runnig method d()......");
	}

}