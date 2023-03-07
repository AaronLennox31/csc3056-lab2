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
	
	
	//Tests for getUpperBound
	public void testGetUpperBoundBothPositiveAndEqual() {
		Range r1 = new Range(5, 5);
		assertEquals("getUpperBound: Did not return the expected output", 5.0, r1.getUpperBound());
	}
	
	public void testGetUpperBoundBothPostiveAndNotEqual() {
		Range r2 = new Range(1, 10);
		assertEquals("getUpperBound: Did not return the expected output", 10.0, r2.getUpperBound());
	}
	
	public void testGetUpperBoundBothNegativeAndNotEqual() {
		Range r3 = new Range(-10, -1);
		assertEquals("getUpperBound: Did not return the expected output", -1.0, r3.getUpperBound());
	}
	
	public void testGetUpperBoundBothNegativeAndEqual() {
		Range r4 = new Range(-5, -5);
		assertEquals("getUpperBound: Did not return the expected output", -5.0, r4.getUpperBound());
	}
	
	public void testGetUpperBoundLowerNegativeAndUpperPositive() {
		Range r5 = new Range(-5, 5);
		assertEquals("getUpperBound: Did not return the expected output", 5.0, r5.getUpperBound());
	}
	
	//Tests for getLowerBound
		public void testGetLowerBoundBothPositiveAndEqual() {
			Range r1 = new Range(5, 5);
			assertEquals("getLowerBound: Did not return the expected output", 5.0, r1.getLowerBound());
		}
		
		public void testGetLowerBoundBothPostiveAndNotEqual() {
			Range r2 = new Range(1, 10);
			assertEquals("getLowerBound: Did not return the expected output", 1.0, r2.getLowerBound());
		}
		
		public void testGetLowerBoundBothNegativeAndNotEqual() {
			Range r3 = new Range(-10, -1);
			assertEquals("getLowerBound: Did not return the expected output", -10.0, r3.getLowerBound());
		}
		
		public void testGetLowerBoundBothNegativeAndEqual() {
			Range r4 = new Range(-5, -5);
			assertEquals("getLowerBound: Did not return the expected output", -5.0, r4.getLowerBound());
		}
		
		public void testGetLowerBoundLowerNegativeAndUpperPositive() {
			Range r5 = new Range(-5, 5);
			assertEquals("getLowerBound: Did not return the expected output", -5.0, r5.getLowerBound());
		}
	
		

	

}
