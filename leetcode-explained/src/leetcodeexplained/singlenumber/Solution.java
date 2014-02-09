package leetcodeexplained.singlenumber;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one. Note: Your algorithm should have a linear runtime
 * complexity. Could you implement it without using extra memory?
 * 
 * In order to implement it without using extra memory we can use the properties
 * of the bitwise operator xor (^): 
 * - xor-ing a number A with 0 will return A.
 * - xor-ing a number with itself will return 0. 
 * - is commutative A ^ B = B ^ A
 * - is associative A ^ (B ^ C) = (A ^ B) ^ C 
 * 
 * Therefore, if we xor all of the numbers in the array, all pairs will be eliminated 
 * and the single number should remain.
 * E.g.: 	A ^ D ^ C ^ A ^ B ^ D ^ C 
 * 			= (A ^ A) ^ (C ^ C) ^ (D ^ D) ^ B 
 * 			= 0 ^ 0 ^ 0 ^ B 
 * 			= B
 * 
 * @author nay
 * 
 */
public class Solution {

	/**
	 * Finds the integer that does not appear twice in the array
	 * 
	 * @param A the array of integers to be processed.
	 * @return the integer in the array that does not appear twice.
	 */
	public int singleNumber(int[] A) {
		
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum ^= A[i];
		}
		return sum;
	}

	/**
	 * Demonstrates the solution with predefined input.
	 * 
	 * @param args Unused.
	 * @return Nothing. 
	 */
	public static void main(String[] args) {

		int[] A = {7, 4, 3, 4, 7 };
		Solution sol = new Solution();

		System.out.println("Solution :" + sol.singleNumber(A));

	}

}

