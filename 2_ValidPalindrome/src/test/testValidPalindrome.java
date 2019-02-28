package test;

import org.junit.Test;
import logic.ValidPalindrome;
import static org.junit.Assert.*;

public class testValidPalindrome {
	
	@Test
	public void testisValidPalindrome() {
		
		assertTrue(ValidPalindrome.isValidPalindrome("racecar")); // Odd Number of characters
		assertTrue(ValidPalindrome.isValidPalindrome("malayalam"));
		assertTrue(ValidPalindrome.isValidPalindrome("maam")); // Even number of characters
		
		assertFalse(ValidPalindrome.isValidPalindrome("Hello World!")); // Checking for non-palindromic strings
		
		assertEquals(true, ValidPalindrome.isValidPalindrome("racecar")); // Substituting assertEquals instead of assertTrue
		assertEquals(true, ValidPalindrome.isValidPalindrome("a")); // Checking for one-character string
		
	}

}
