package com.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

@Test
public void testSimplePalindrome() throws Exception {
	PalindromeChecker palindromeChecker = new PalindromeChecker();
	//assertTrue(palindromeChecker.isPalindrome("aba"));
	//assertTrue(palindromeChecker.isPalindrome("nitin"));
	assertTrue(palindromeChecker.isPalindrome("abba"));
}



}
