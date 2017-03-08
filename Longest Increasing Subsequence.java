/*The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.*/

//O(nlogn)
public class LongestIncreasingSequence {
	static int Max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static int Sequence(int[] a, int n) {
		int max = 1;
		for (int i = 0; i < n; i++) {
			int count = 1;
			int k = -1;
			for (int j = 0; j < n - 1; j++) {
				if (a[j + 1] > a[j]) {
					a[j] = k;
					count++;
				}
			}
			max = Max(max, count);
			k--;
		}
		return max;
	}

	public static void main(String args[]) {
		
		
	
		int a[] = { 50, 3, 10, 7, 40, 80 };
		int n = a.length;
		int result = Sequence(a, n);
		System.out.println(result);
	}

}
