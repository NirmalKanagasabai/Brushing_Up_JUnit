package test;

import org.junit.Test;
import logic.FindMaximum;
import static org.junit.Assert.*;

public class testFindMaximum {
	
	@Test
	public void testFindMax() {
		assertEquals(4, FindMaximum.findMaximum(new int[] {3, 1, 4, 0, -5}));
		assertEquals(-1, FindMaximum.findMaximum(new int[] {-9, -5, -3, -1}));
		assertTrue(5 > FindMaximum.findMaximum(new int[] {3, 1, 4})); 
	}

}
