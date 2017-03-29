
public class CuttingaRod {
	
	static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}

	static void max_length(int[] a, int n)
	{
		int i;
		int[] val = new int[n+1];
		for(i=1;i<=n;i++)
		{
			val[i]=a[i-1];
			
		}
		
	int[][] dp = new int[n+1][n+1];
	for(i=1;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(j==0)
			{
				dp[i][j]=0;
			}
			if(i==1 && j!=0)
			{
				dp[i][j] = val[i]+dp[i][j-1];
			}
			else
			{
				if(j>=i)
				{
					dp[i][j] = max(dp[i-1][j],val[i]+dp[i][j-i]);
				}
				else
				{
					dp[i][j] = dp[i-1][j];
				}
			}
		
		}
		
		
	}
	
	System.out.println(dp[n][n]);
		
	}
	
	
	
	
	public static void main(String args[])
	{
		int[] a = {1, 5, 8, 9, 10, 17, 17, 20};
		int n = a.length;
		max_length(a,n);
	}
}
