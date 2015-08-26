package core;

import static org.junit.Assert.*;

import org.junit.*;

public class TestSuite {
		@BeforeClass 
		public static void RunBeforeClass () throws Exception {
			System.out.println("This method executes once before the test suite");
		}

		@Before 
		public void Berfore () throws Exception {
			System.out.println("This method executes each time before the test case");
		}

		@AfterClass

		public static void RunAfterClass () throws Exception {
			System.out.println("AfterClass method will execute onve after the test suite");
		}

		@After

		public  void After () throws Exception {
			System.out.println("After method will execute every time with each the test case");
		}

		@Test
		public void TC_01_assertEquals_positive() {
			System.out.println("TC_01_assertEquals_positive");
			String str ="Privet";
			assertEquals ("Strings are equal", "Privet", str);

		}

		@Test
		public void TC_02_assertEquals_negative() {
			System.out.println("TC_02_assertEquals_negative");
			String str ="Privet";
			assertEquals ("Strings are NOT equal", "Priv", str);

		}
		@Ignore
		@Test
		public void TC_03_assertEquals_ignored() {
			System.out.println("TC_03_assertEquals_ignored");
			String str ="Privet";
			assertEquals ("Failure -Strings are NOT equal", "Privet", str);		
		}

		@Test

		public void TC_04_assertSame_positive() {
			System.out.println("TC_04_assertSame_positive");
			Integer i = 555;
			assertSame ("It is positive-they are same",555, i);

		}
		@Test

		public void TC_05_assertSame_negative() {
			System.out.println("TC_05_assertSame_negative");
			Integer i = 555;
			assertSame ("Ops! Negative-they are NOT the same", 55, i);

		}
		@Ignore
		@Test
		public void TC_06_assertSame_ignored() {
			System.out.println("TC_06_assertSame_ignored");
			Integer i = 555;
			assertSame ("Ops! Negative-they are NOT the same", 55, i);

		}
		@Test

		public void TC_07_assertTrue_positive() {
			System.out.println("TC_07_assertTrue_positive");
			Boolean t = true;
			assertTrue ("Result is positive-it is true",t);

		}
		@Test

		public void TC_08_assertTrue_negative() {
			System.out.println("TC_08_assertTrue_negative");
			Boolean t = true;
			assertTrue ("Result is neagtive-it is false",t);

		}
		@Test

		public void TC_09_assertFalse_positive() {
			System.out.println("TC_09_assertFalse_positive");
			Boolean t = true;

			assertFalse ("Result is positive-it is true",t);

		}
		@Test

		public void TC_10_assertFalse_negative() {
			System.out.println("TC_10_assertFalse_negative");
			Boolean f =false;
			assertFalse ("Result is negative-it is true",f);

		}
	}



	