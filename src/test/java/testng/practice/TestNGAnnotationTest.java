package testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Running...");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Running...");		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Running...");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test Running...");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Running...");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class Running...");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Running...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Running...");
	}

	@Test
	public void test1(Method m) {
		System.out.println(m.getName());
	}
}