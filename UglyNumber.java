import java.util.*;
public class UglyNumber {
	
	static int min(int a1, int a2, int a3)
	{
		if(a1<=a2 && a1<=a3)
		{
			return a1;
		}
		else if(a2<=a1 && a2<=a3)
		{
			return a2;
		}
		else
		{
			return a3;
		}
	}
	void findNumber(int n)
	{
		int i2=0;
		int i3=0;
		int i5=0;
		
		int[] dp = new int[n];
		dp[0]=1;
		int i=1;
		while(i<n)
		{
			dp[i] = min(dp[i2]*2,dp[i3]*3,dp[i5]*5);
			if(dp[i]==dp[i2]*2)
			{
				i2++;
			}
			if(dp[i]==dp[i3]*3)
			{
				i3++;
			}
			else
			{
				i5++;
			}
			i++;
		}
		System.out.println(dp[n-1]);
		
		
	}
	
public static void main(String args[])
{
	int n = 7;
	UglyNumber un = new UglyNumber();
	un.findNumber(n);
}
}
