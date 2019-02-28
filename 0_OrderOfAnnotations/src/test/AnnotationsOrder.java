package test;

import org.junit.*;

public class AnnotationsOrder {
	
	static String beforeClass = "@BeforeClass"; 
	String before = "@Before";
	static String afterClass = "@AfterClass";
	String after = "@After";
	static int count = 1;
	
	@BeforeClass
	public static void beforeClassAnnotation() { // This method needs to be static
		System.out.println("I, " + beforeClass + ", am invoked only once and that too, before all test cases");
	}
	
	@AfterClass
	public static void afterClassAnnotation() { // This method needs to be static
		System.out.println("I, " + afterClass + ", am invoked only once and that too, after all test cases");
	}
	
	@Before
	public void beforeAnnotation() {
		System.out.println("I, " + before + ", am invoked before every test case");
	}
	
	@After
	public void afterAnnotation() {
		System.out.println("I, " + after + ", am invoked after every test case");
	}
	
	@Test
	public void test1() {
		System.out.println("Test Number: " + count);
		count++;
	}
	
	@Test
	public void test2() {
		System.out.println("Test Number: " + count);
		count++;
	}
	
}
