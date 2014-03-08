package com.palindrome;

import java.util.Stack;

public class PalindromeChecker {

	Stack<Character> stack;
	
	public boolean isPalindrome(String string) {
		stack = new Stack<Character>();
		for (int i=0; i<string.length()/2; i++) {
			stack.push(string.charAt(i));
		}
		
		for (int i=(string.length()/2); i<string.length(); i++) {
			if(string.charAt(i) == stack.pop()){

			}else{
				return false;
			}
			
		}
	
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}

}
