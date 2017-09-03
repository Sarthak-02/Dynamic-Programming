//http://www.geeksforgeeks.org/how-to-print-maximum-number-of-a-using-given-four-keys/
import java.util.*;
public class printMaxA {
	static void printA(int n ) {
		if(n<=6) {
			System.out.println(n);
		}
		else
		{
			int[] dp = new int[n+1];
			int max_so_far=0;
			for(int i=0;i<=6;i++) {
				dp[i]=i;
			}
			int t=0;
			for(int i=7;i<=n;i++) {
				t=2;
				max_so_far=0;
				for(int j =i-3;j>=1;j--) {
					//System.out.println(max_so_far);
					if(max_so_far<t*dp[j]) {
						max_so_far=t*dp[j];
					}
					t++;
				}
				dp[i] = max_so_far;
			}
			System.out.println(dp[n]);
		}
	}
	public static void main(String[] args) {
		int n= 11;
		printA(n);
	}
}
