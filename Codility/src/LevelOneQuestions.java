
public class LevelOneQuestions {
	
	/**
	 * A zero-indexed array A consisting of N different integers is given. 
	 * The array contains integers in the range [1..(N + 1)], which means that exactly one 
	 * element is missing.Your goal is to find that missing element.
	 * Write a function:
	 * 
	 * class Solution { public int findMissingElem(int[] A); }
	 * that, given a zero-indexed array A, returns the value of the missing element.
	 * For example, given array A such that:
	 * A[0] = 2
	 * A[1] = 3  
	 * A[2] = 1
	 * A[3] = 5
	 * the function should return 4, as it is the missing element.
	 * Assume that:
	 * N is an integer within the range [0..100,000];
	 * the elements of A are all distinct;
	 * each element of array A is an integer within the range [1..(N + 1)].
	 * Complexity:
	 * expected worst-case time complexity is O(N);
	 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
	 * Elements of input arrays can be modified.
	 */
	
    public int findMissingElem(int[] A) {
    	// If the length of the array is 0, no element is missing
        if(A.length == 0) { return 1; }
        if(A.length == 1) { return 2; }
        // Numbers are from [1..to (N+1)]
        long N = A.length + 1;
        // The sum of N numbers is N*(N+1)/2
        long total = N * (N + 1) / 2;

        // Loop through the numbers in the array taking away from
        // the total sum. Whatever number is left is what is
        // missing
        for (int i : A) {
            total -= i;
        }

        return (int)total;
    }
    
    
    
    
    
    
    /**
     *  A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
     *	Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
     *	The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
     *	In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
     *	For example, consider array A such that:
     * 
     * A[0] = 3
     * A[1] = 1
     * A[2] = 2
     * A[3] = 4
     * A[4] = 3
     * 
     * 
     *  We can split this tape in four places:
     *	P = 1, difference = |3 − 10| = 7 
     *	P = 2, difference = |4 − 9| = 5 
     *	P = 3, difference = |6 − 7| = 1 
     *	P = 4, difference = |10 − 3| = 7 
     *	Write a function:
     * 
     * 
     * class Solution { public int minDistance(int[] A); }
	 * that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
	 *
	 *  For example, given:
	 *
	 *    A[0] = 3
	 *    A[1] = 1
	 *    A[2] = 2
	 *    A[3] = 4
	 *    A[4] = 3
	 *  the function should return 1, as explained above.
	 *  Assume that:
	 *  N is an integer within the range [2..100,000];
	 *  each element of array A is an integer within the range [−1,000..1,000].
	 *  Complexity:
	 *  expected worst-case time complexity is O(N);
	 *  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
	 *  Elements of input arrays can be modified.
    */
    
    public int minDistance(int[] A) {
    	// This can be done in O(N) time and O(1) space
    	// Idea:
    	// The general idea is to keep a track of the left
    	// and right sum. 
    	// Initially we make the left sum the sum of the array
    	// and subtract from it and add to the right sum as
    	// we go through the array.
    	// As we go we check if min_diff is less than the diff
    	// of the left and right sums
    	if(A.length == 0) { return 0; }
    	if(A.length == 1) { return A[0]; }
    	if(A.length == 2) { return Math.abs(A[1] - A[0]); }
    	
    	int left_sum = 0;
    	int right_sum = 0;
    	int min_diff = Integer.MAX_VALUE;
    	
    	for(int x : A) {
    		left_sum += x;
    	}
    	
    	for(int i = A.length - 1; i >= 0; i--) {
    		left_sum -= A[i];
    		right_sum += A[i];
    		
    		int difference = Math.abs(left_sum - right_sum);
    		if(difference == 0) { return 0; }
    		if(difference < min_diff) {
    			min_diff = difference;
    		}
    	}
    	return min_diff;
    }
    
    
    
    /**
     * A small frog wants to get to the other side of the road. 
     * The frog is currently located at position X and wants to get to a position greater than 
     * or equal to Y. The small frog always jumps a fixed distance, D.
     * Count the minimal number of jumps that the small frog must perform to reach its target.
     * Write a function:
     * class Solution { public int solution(int X, int Y, int D); }
     * that, given three integers X, Y and D, returns the minimal number of jumps from position X 
     * to a position equal to or greater than Y.
     * For example, given:
     * X = 10
     * Y = 85
     * D = 30
     * the function should return 3, because the frog will be positioned as follows:
     * after the first jump, at position 10 + 30 = 40
     * after the second jump, at position 10 + 30 + 30 = 70
     * after the third jump, at position 10 + 30 + 30 + 30 = 100
     * Assume that:
     * X, Y and D are integers within the range [1..1,000,000,000];
     * X ≤ Y.
     * Complexity:
     * expected worst-case time complexity is O(1);
     * expected worst-case space complexity is O(1).
     */
    
    public int findSmallestFrogJump(int X, int Y, int D) {
    	return 0;
    }

}
