package org.jfree.data.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
		//super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCentralValueShouldBeZero() {
		assertEqulas("The central value of -1 and 1 should be 0",
				0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
		
}

}
