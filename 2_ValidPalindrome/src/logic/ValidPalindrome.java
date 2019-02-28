package logic;

public class ValidPalindrome {
	
	public static boolean isValidPalindrome(String str) {
		
		int length = str.length();
		for (int i=0; i < length/2; i++) {
			if (str.charAt(i) != str.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	}

}
