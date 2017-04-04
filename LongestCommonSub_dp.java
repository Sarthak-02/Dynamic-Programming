
public class LongestCommonSub_dp {

	static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static int LCS(String s1,String s2)
	{
	 	int n = s1.length();
	 	int m = s2.length();
	 	int dp[][] = new int[n+1][m+1];
	 	for(int i=0;i<=m;i++)
	 	{
	 		dp[0][i]=0;
	 	}
	 	for(int i=0;i<=n;i++)
	 	{
	 		dp[i][0]=0;
	 	}
	 	for(int i=1;i<=n;i++)
	 	{
	 		for(int j=1;j<=m;j++)
	 		{
	 			if(s1.charAt(i-1)==s2.charAt(j-1))
	 			{
	 				dp[i][j] = dp[i-1][j-1]+1;
	 			}
	 			else
	 				dp[i][j] = max(dp[i][j-1],dp[i-1][j]);
	 			
	 		}
	 	}
	 	return dp[n][m];
	}
	public static void main(String agrs[])
	{
		String s1 = "banana";
		String s2 = "atana";

		int Sequence = LCS(s1, s2);
		System.out.print(Sequence);
	}
}
