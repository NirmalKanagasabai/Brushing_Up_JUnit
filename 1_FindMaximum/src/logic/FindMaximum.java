package logic;

public class FindMaximum {
	
	public static int findMaximum(int[] inputArray) {
		
		//int max = 0; // To avoid the assertion error when there are negative integers
		
		// ASSUMPTION: The inputArray is not null. There's at least one element in it. 
		int max = inputArray[0];
		
		for (int i=0; i<inputArray.length; i++) {
			if (inputArray[i] > max) {
				max = inputArray[i];
			} else {
				continue;
			}
		}
		
		return max;
	}
}
