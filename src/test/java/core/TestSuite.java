package core;

import static org.junit.Assert.*;

import org.junit.*;

public class TestSuite {
	public static String s = "Testing Junit 4";
	public static Integer i = 55;
	public static Boolean t = true;
	public static Boolean f = false;

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	@BeforeClass
	public static void RunBeforeClass() throws Exception {
		// System.out.println("This method executes once before the test suite");
	}

	@Before
	public void Berfore() throws Exception {
		// System.out.println("This method executes each time before the test case");
	}

	@AfterClass
	public static void RunAfterClass() throws Exception {
		//System.out.println("AfterClass method will execute onve after the test suite");
	}

	@After
	public void After() throws Exception {
		//System.out.println("After method will execute every time with each the test case");
	}

	@Test
	public void TC_01_assertEquals_positive() {assertEquals("Strings are equal", "Hello world!", TestSuite.s);}
		//System.out.println("TC_01_assertEquals_positive");
		//String str = "Privet";
		//assertEquals("Strings are equal", "Privet", str);

	@Test
	public void TC_02_assertEquals_negative() {assertEquals("Strings are NOT equal", "Priv", TestSuite.s);}
		//System.out.println("TC_02_assertEquals_negative");
		//String str = "Privet";
		//assertEquals("Strings are NOT equal", "Priv", str);

	@Ignore
	@Test
	public void TC_03_assertEquals_ignored() {assertEquals("Failure -Strings are NOT equal", "Privet", s);}
		//System.out.println("TC_03_assertEquals_ignored");
		//String str = "Privet";
		//assertEquals("Failure -Strings are NOT equal", "Privet", str);
	
	@Test
	public void TC_04_assertSame_positive() {assertSame("Integer is not the same", 55, TestSuite.i);
		//System.out.println("TC_04_assertSame_positive");
		//Integer i = 555;
		//assertSame("It is positive-they are same", 555, i);
	}
	@Test
	public void TC_05_assertSame_negative() {assertSame("Ops! Negative-they are NOT the same", 55, TestSuite.i);
		//System.out.println("TC_05_assertSame_negative");
		//Integer i = 555;
		//assertSame("Ops! Negative-they are NOT the same", 55, TestSuite.i);
	}
	@Ignore
	@Test
	public void TC_06_assertSame_ignored() {assertSame("Ops! Negative-they are NOT the same", 56, TestSuite.i);}
		//System.out.println("TC_06_assertSame_ignored");
		//Integer i = 555;
		//assertSame("Ops! Negative-they are NOT the same", 55, i);
	
	@Test
	public void TC_07_assertTrue_positive() {assertTrue("Boolean should be true.", TestSuite.t);}
		//System.out.println("TC_07_assertTrue_positive");
		//Boolean t = true;
	
	@Test
	public void TC_08_assertTrue_negative() {assertTrue("Boolean should be true.", TestSuite.f);}
		//System.out.println("TC_08_assertTrue_negative");
		//Boolean t = true;
		//assertTrue("Result is negative-it is false", t);

	@Test
	public void TC_09_assertFalse_positive() {assertFalse("Boolean should be false.", TestSuite.f);}
		//System.out.println("TC_09_assertFalse_positive");
		//Boolean t = true;
		//assertFalse("Result is positive-it is true", t);

	@Test
	public void TC_10_assertFalse_negative() {assertFalse("Boolean should be false.", TestSuite.t);}
		//System.out.println("TC_10_assertFalse_negative");
		//Boolean f = false;
		//assertFalse("Result is negative-it is true", f);
}
