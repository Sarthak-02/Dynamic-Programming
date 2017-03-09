


//Explanation at https://www.youtube.com/watch?v=We3YDTzNXEk



public class MinEditDistance {

	
	static int min(int a, int b, int c)
	{
		int smallest;
		if (a < b && a < c) {
			smallest = a;
		} else if (b < c && b < a) {
			smallest = b;
		} else {
			smallest = c;
		}
		return smallest;
	}
	static int MED(String s1, String s2)
	{
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int [m+1][n+1];
		
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
				{
					dp[i][j]=j;
				}
				else if(j==0)
				{
					dp[i][j]=i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else
				{
					dp[i][j]= 1+min(dp[i-1][j],dp[i-1][j-1],dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}
	
	
	public static void main(String args[])
	{
		String s1 = "geek";
		String s2 = "gesek";
		int result=MED(s1,s2);
		System.out.println(result);
		
	}
}
