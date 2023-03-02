package org.jfree.data.test;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.junit.*;


public class RangeTest extends TestCase {

	private Range rangeObjectUnderTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	protected void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1, 1);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		assertEquals("The central value of -1 and 1 should be 0",
				0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
	}
	
	
	//Tests For getLengthMethod
	public void testGetLengthBothPositiveAndEqual() {
	    Range r1 = new Range(2, 2);
	    assertEquals("getLength: Did not return the expected output", 0.0, r1.getLength());
	}
	
	public void testGetLengthBothPositiveAndNotEqual() {
	    Range r2 = new Range(4, 9);
	}
	public void testGetLengthBothNegativeAndEqual() {
	    Range r3 = new Range(-99, -99);
	    assertEquals("getLength: Did not return the expected output", 0.0, r3.getLength());
	}
	public void testGetLengthBothNegativeAndNotEqual() {
	    Range r4 = new Range(-11, -4);
	    assertEquals("getLength: Did not return the expected output", 7.0, r4.getLength());
	}
	public void testGetLengthOnePositiveOneNegative() {
	    Range r5 = new Range(-5, 3);
	    assertEquals("getLength: Did not return the expected output", 8.0, r5.getLength());
	}
	
	
	
	//Tests for getCentralValue
	public void testGetCentralValue() {
	    Range r1 = new Range(1, 5);
	    assertEquals( 3.0, r1.getCentralValue());
	}

	

}
