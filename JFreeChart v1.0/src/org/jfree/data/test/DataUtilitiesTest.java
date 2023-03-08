package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.jfree.data.DataUtilities; 
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D; 
import junit.framework.TestCase; 

public class DataUtilitiesTest {
	
	private Values2D values2D;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp(){
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
		testValues.addValue(1, 0, 0);
		testValues.addValue(4, 1, 0);
	}

	@After
	public void tearDown(){
		values2D = null;
	}

	@Test
	public void testValidDataAndColumnTotal() {
		assertEquals("Wrong sum returned. It should be 5.0",  
		        5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d); 
	}
	@Test
	public void testNullDataColumnTotal()
	{ 
	  try 
	  { 
	    DataUtilities.calculateColumnTotal(null, 0); 
	    fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException"); 
	  } 
	  catch (Exception e) 
	  { 
	    assertTrue("Incorrect exception type thrown",  
	      e.getClass().equals(IllegalArgumentException.class)); 
	  } 
	} 
	
	
	//Tests for createNumberArray
	@Test
	public void testCreateNumberArrayNull() {
		try 
			{ 
				DataUtilities.createNumberArray(null); 
				fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException"); 
			} 
		catch (Exception e) 
			{ 
				assertTrue("Incorrect exception type thrown",  
				e.getClass().equals(IllegalArgumentException.class)); 
			} 
	}
	
	@Test
	public void testCreateNumberArrayNonNull() {
		 double[] data = {1, 2, 3};
		 Number[] numbers = {1, 2, 3};
		 assertEquals("createNumberArray: Did not return the expected output", numbers, DataUtilities.createNumberArray(data));
	}
	
	@Test
	public void testCreateNumberArrayEmpty() {
		 double[] data = {};
		 Number[] numbers = {};
		 assertEquals("createNumberArray: Did not return the expected output", numbers, DataUtilities.createNumberArray(data));
	}
	
	
	//Tests for createNumberArray2D
		@Test
		public void testCreateNumberArray2DNull() {
			try 
				{ 
					DataUtilities.createNumberArray2D(null); 
					fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException"); 
				} 
			catch (Exception e) 
				{ 
					assertTrue("Incorrect exception type thrown",  
					e.getClass().equals(IllegalArgumentException.class)); 
				} 
		}
	
		@Test
		public void testCreateNumberArray2DNonNull() {
			 double[][] data = {{1,2,3}, {1,2,3},  {1,2,3}};
			 Number[][] numbers = {{1,2,3}, {1,2,3},  {1,2,3}};
			 assertEquals("createNumberArray2D: Did not return the expected output", numbers, DataUtilities.createNumberArray2D(data));
		}
		
		@Test
		public void testCreateNumberArray2DEmpty() {
			 double[][] data = {};
			 Number[][] numbers = {};
			 assertEquals("createNumberArray2D: Did not return the expected output", numbers, DataUtilities.createNumberArray2D(data));
		}
		
		//Tests for getCumulativePercentages
		@Test
		public void testGetCumulativePercentagesNull() {
			 
			 try 
				{ 
				 DefaultKeyedValues keyvalues = null;
				 KeyedValues object_under_test = DataUtilities.getCumulativePercentages((KeyedValues) keyvalues);
				 fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException"); 
				} 
			catch (Exception e) 
				{ 
					assertTrue("Incorrect exception type thrown",  
					e.getClass().equals(IllegalArgumentException.class)); 
				} 
			
		}
		
		@Test
		public void testGetCumulativePercentagesNonNull() {
			DefaultKeyedValues keyvalues = new DefaultKeyedValues();
			keyvalues.addValue((Comparable) 0.0,  6.0);
			keyvalues.addValue((Comparable) 1.0,  11.0);
			keyvalues.addValue((Comparable) 2.0,  3.0);
			KeyedValues object_under_test = DataUtilities.getCumulativePercentages((KeyedValues) keyvalues);
			assertEquals((double) object_under_test.getValue(2), 1.0, 0.000000001d);
		}
			
}
